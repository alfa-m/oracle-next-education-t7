package br.com.alura.screenmatch.modelos;

//import com.google.gson.annotations.SerializedName;

import br.com.alura.screenmatch.excecoes.ErroConversaoAnoException;

public class Titulo implements Comparable<Titulo> {
    //@SerializedName("Title")
    private String nome;
    //@SerializedName("Year")
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double avaliacaoTotal;
    private int quantidadeDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(TituloOmdb tituloOmdb) {
        this.nome = tituloOmdb.title();

        if (tituloOmdb.year().length() > 4) {
            throw new ErroConversaoAnoException("Não foi possível criar o título" +
                    " pois o ano encontrado possui mais de 4 caracteres");
        }
        this.anoDeLancamento = Integer.valueOf(tituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(tituloOmdb.runtime().substring(0,2));
    }

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public void exibeFichaTecnica(){
        String infoConta;
        if(incluidoNoPlano == true){
            infoConta = "Está incluso";
        } else {
            infoConta = "Não está incluso";
        }

        String infoFilme = """
                Título: %s
                Lançado em %d
                %s na sua assinatura
                Avaliação: %.2f (%d)
                """.formatted(nome, anoDeLancamento,
                infoConta, pegaMedia(), quantidadeDeAvaliacoes);

        System.out.println(infoFilme);
    }

    public void avalia(double nota){
        quantidadeDeAvaliacoes++;
        avaliacaoTotal += nota;
        System.out.println("Nova avaliação inserida com sucesso!");
    }

    public double pegaMedia(){
        return avaliacaoTotal / quantidadeDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getAvaliacaoTotal() {
        return avaliacaoTotal;
    }

    public int getQuantidadeDeAvaliacoes(){
        return quantidadeDeAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + " (" + this.getAnoDeLancamento() +
                ") | Duração: " + this.getDuracaoEmMinutos() + " min";
    }
}

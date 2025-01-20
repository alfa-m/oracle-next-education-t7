package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Tron", 1982);
        filme1.setIncluidoNoPlano(true);
        filme1.setDuracaoEmMinutos(96);

        filme1.exibeFichaTecnica();
        filme1.avalia(6.7);
        System.out.println("Total de avaliações: " + filme1.getQuantidadeDeAvaliacoes());
        System.out.println();

        filme1.exibeFichaTecnica();
        filme1.avalia(7.8);
        System.out.println("Total de avaliações: " + filme1.getQuantidadeDeAvaliacoes());
        System.out.println();

        filme1.exibeFichaTecnica();
        filme1.avalia(9.4);
        System.out.println("Total de avaliações: " + filme1.getQuantidadeDeAvaliacoes());
        System.out.println("Duração de " + filme1.getNome() + ": " + filme1.getDuracaoEmMinutos() + " min");

        Serie lost = new Serie("Lost", 2005);
        lost.setTemporadas(6);
        lost.setEpisodiosPorTemporada(24);
        lost.setMinutosPorEpisodio(50);
        lost.exibeFichaTecnica();
        System.out.println("Duração para maratonar " + lost.getNome() + ": " + lost.getDuracaoEmMinutos() + " min");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        System.out.println("Tempo total: " + calculadora.getTempoTotal() + " min");

        Filme filme2 = new Filme("O poderoso chefão", 1972);
        filme2.setDuracaoEmMinutos(175);
        calculadora.inclui(filme2);
        System.out.println("Tempo total: " + calculadora.getTempoTotal() + " min");

        calculadora.inclui(lost);
        System.out.println("Tempo total: " + calculadora.getTempoTotal() + " min");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme1);
        filtro.filtra(filme2);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        Filme filme3 = new Filme("Avatar", 2009);
        filme3.setDuracaoEmMinutos(162);
        filme3.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(filme3);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do primeiro filme: " + listaDeFilmes.get(0).toString());

    }
}

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes = 0;

    void exibeFichaTecnica(){
        String infoMusica = """
                Música: %s
                Artista: %s
                Ano de lançamento: %d
                Avaliacao: %.2f (%d)
                """.formatted(this.titulo, this.artista,
                this.anoLancamento, this.avaliacao, this.numAvaliacoes);
        System.out.println(infoMusica);
    }

    void avaliaMusica(double novaAvaliacao){
        avaliacao += novaAvaliacao;
        numAvaliacoes++;
    }

    double calculaMedia(){
        return avaliacao / numAvaliacoes;
    }
}

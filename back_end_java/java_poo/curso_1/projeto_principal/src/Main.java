public class Main {
    // Projeto de streaming de filmes Screen Watch
    public static void main(String[] args) {
        System.out.println("Esse é o Scream Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);

        boolean incluidoNoPlano = true;
        System.out.println("Incluso no plano: " + incluidoNoPlano);

        double notaDoFilme = 8.1;
        System.out.println("Nota: " + notaDoFilme);

        double mediaNotas = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(String.format("Média: %.2f", mediaNotas));

        String sinopse = """
                Filme de aventura com galã dos anos 80.
                Filme muito bom!
                (ou não, não sei, eu não vi)
                Ano de lançamento: %d
                """.formatted(anoDeLancamento);
        System.out.println("Sinopse: " + sinopse);

        int classificacao = (int) (mediaNotas / 2);
        System.out.println("Classificação: " + classificacao);
    }
}

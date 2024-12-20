import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite se filme favorito");
        String filme = leitura.nextLine();

        System.out.println("Qual o ano de lançamento?");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Diga sua avaliação para o filme (0,0 a 10,0):");
        double avaliacaoFilme = leitura.nextDouble();

        String saida = """
                Seu filme favorito é %s, lançado em %d
                Avaliação: %.2f
                """.formatted(filme, anoDeLancamento, avaliacaoFilme);
        System.out.println(saida);
    }
}

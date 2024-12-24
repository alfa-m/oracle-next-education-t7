import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double avaliacaoTotalFilme = 0;
        double notaFilme = 0;
        double mediaNotas = 0;


        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliação para o filme (0,0 a 10,0):");
            notaFilme = leitura.nextDouble();
            avaliacaoTotalFilme += notaFilme;
        }

        mediaNotas = avaliacaoTotalFilme / 3;
        System.out.println(String.format("Média das notas: %.2f", mediaNotas));

    }
}

import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double avaliacaoTotalFilme = 0;
        double notaFilme = 0;
        double mediaNotas = 0;
        int quantidadeNotas = 0;

        while (notaFilme != -1) {
            System.out.println("Digite sua avaliação para o filme (0,0 a 10,0)" +
                    " ou digite -1 para sair:");
            notaFilme = leitura.nextDouble();

            if (notaFilme != -1) {
                avaliacaoTotalFilme += notaFilme;
                quantidadeNotas++;
            }
        }

        if (quantidadeNotas != 0) {
            mediaNotas = avaliacaoTotalFilme / quantidadeNotas;
            System.out.println(String.format("Média das notas: %.2f", mediaNotas));
        } else {
            System.out.println("Você não digitou nenhuma nota");
        }
    }
}

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);
        int tentativas = 0;
        int tentativasMaximas = 5;
        Scanner leTeclado = new Scanner(System.in);
        int chuteUsuario = 0;

        String mensagemInicial = """
                ===============================================================
                ===================== JOGO DA ADIVINHAÇÃO =====================
                ===============================================================
                Tente adivinhar o número secreto entre 0 e 100 em 5 tentativas
                """;
        System.out.println(mensagemInicial);

        while (tentativas < tentativasMaximas) {
            System.out.println("Insira seu chute:");
            chuteUsuario = leTeclado.nextInt();
            tentativas++;

            if (numeroAleatorio == chuteUsuario) {
                System.out.println(String.format(
                        "Você acertou o número secreto (%d) em %d tentativas! " +
                        "Parabéns!", numeroAleatorio, tentativas));
                break;
            } else {
                if (chuteUsuario < numeroAleatorio) {
                    System.out.println(String.format("O número secreto é maior que %d", chuteUsuario));
                    System.out.println("Tentivas restantes: " + (tentativasMaximas - tentativas));
                } else {
                    System.out.println(String.format("O número secreto é menor que %d", chuteUsuario));
                    System.out.println("Tentivas restantes: " + (tentativasMaximas - tentativas));
                }
            }
        }

        if (tentativas == tentativasMaximas && chuteUsuario != numeroAleatorio) {
            System.out.println("Você esgotou suas tentativas");
            System.out.println("O número secreto era " + numeroAleatorio);
        }
    }
}

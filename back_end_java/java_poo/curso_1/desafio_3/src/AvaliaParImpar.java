import java.util.Scanner;

public class AvaliaParImpar {
    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);
        System.out.println("Por favor, insira um número inteiro:");
        int numero = leTeclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Número par");
        } else {
            System.out.println("Número ímpar");
        }
    }
}

import java.util.Scanner;

public class AvaliaPolaridadeNumero {
    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);
        System.out.println("Por favor, insira um número inteiro:");
        int numeroLido = leTeclado.nextInt();

        if (numeroLido > 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }
    }
}

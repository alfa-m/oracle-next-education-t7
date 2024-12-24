import java.util.Scanner;

public class CalculaFatorial {
    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);
        System.out.println("Digite um número natural:");
        int numero = leTeclado.nextInt();
        int fatorialNumero = 1;

        if (numero >= 0) {
            for (int i = 1; i <= numero; i++) {
                fatorialNumero *= i;
            }
            System.out.println(numero + "! = " + fatorialNumero);
        } else {
            System.out.println("Valor inserido inválido");
        }
    }
}

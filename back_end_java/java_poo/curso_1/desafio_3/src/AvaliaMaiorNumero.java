import java.util.Scanner;

public class AvaliaMaiorNumero {
    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);
        System.out.println("Por favor, insira o primeiro número inteiro:");
        int numero1 = leTeclado.nextInt();
        System.out.println("Por favor, insira o segundo número inteiro:");
        int numero2 = leTeclado.nextInt();

        if (numero1 == numero2) {
            System.out.println("Os números são iguais");
            System.out.println("(" +  + numero1 + " = " + numero2 + ")");
        } else {
            System.out.println("Os números são diferentes");
            if (numero1 > numero2) {
                System.out.println("O primeiro número é maior que o segundo número");
                System.out.println("(" +  + numero1 + " > " + numero2 + ")");
            } else {
                System.out.println("O segundo número é maior que o primeiro número");
                System.out.println("(" +  + numero2 + " > " + numero1 + ")");
            }
        }
    }
}

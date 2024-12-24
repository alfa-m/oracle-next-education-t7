import java.util.Scanner;

public class CalculaTabuada {
    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);
        System.out.println("Insira um número inteiro:");
        int numero = leTeclado.nextInt();

        System.out.println("Tabuada do " + numero + ":");
         for (int i = 1; i <= 10; i++) {
             System.out.println(String.format("%d x %d = %d", i, numero, numero * i));
         }
    }
}

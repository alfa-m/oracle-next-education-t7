import java.util.*;

public class Perfil {
    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        String nomeUsuario = leTeclado.nextLine();
        System.out.println("Olá, " + nomeUsuario + "!");
        System.out.println("Tudo bem?");
    }
}

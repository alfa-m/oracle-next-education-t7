import java.util.Scanner;

public class MenuArea {
    public static void main(String[] args) {
        double area = 0.0;
        int opcaoSelecionada = 0;
        Scanner leTeclado = new Scanner(System.in);

        String mensagemMenu = """
                ***********************************************
                ************* CALCULADORA DE ÁREA *************
                ***********************************************
                
                Por favor, escolha uma das opções abaixo:
                1. Calcular área do quadrado
                2. Calcular área do círculo
                """;
        System.out.println(mensagemMenu);
        opcaoSelecionada = leTeclado.nextInt();

        switch (opcaoSelecionada) {
            case 1:
                double lateral = 0.0;
                System.out.println("Você escolher calcular a área do quadrado");
                System.out.println("Qual o tamanho da lateral do quadrado?");
                lateral = leTeclado.nextDouble();
                area = Math.pow(lateral, 2);
                System.out.println("A área do quadrado é " + area);
                break;
            case 2:
                double raio = 0.0;
                System.out.println("Você escolher calcular a área do círculo");
                System.out.println("Qual o tamanho do raio do círculo?");
                raio = leTeclado.nextDouble();
                area = Math.PI * Math.pow(raio, 2);
                System.out.println("A área do círculo é " + area);
                break;
            default:
                System.out.println("Você não inseriu uma opção válida. Tente novamente");
        }
    }
}

import java.util.Scanner;

public class BancoVirtual {
    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);

        String nomeCliente;
        String tipoConta;
        double saldo = 0;
        int opcao = 0;

        System.out.println("Inicialização dos dados do cliente:");
        System.out.println("\nQual o nome do cliente?:");
        nomeCliente = leTeclado.nextLine();
        System.out.println("\nQual o tipo da conta?:");
        tipoConta = leTeclado.nextLine();
        System.out.println("\nQual o saldo inicial do cliente?:");
        saldo = leTeclado.nextDouble();

        String telaMenu = """                
                Operações
                
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                
                Digite a opção desejada:
                """;

        while (opcao != 4) {
            String dadosUsuario = """
                **********************************************************************
                
                Dados iniciais do cliente
                
                Nome: %s
                Tipo de conta: %s
                Saldo: R$ %.2f
                
                **********************************************************************
                """.formatted(nomeCliente, tipoConta, saldo);
            System.out.println(dadosUsuario);
            System.out.println(telaMenu);

            opcao = leTeclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(String.format("Seu saldo atual é R$ %.2f", saldo));
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Informe o valor a receber:");
                    double valorRecebido = leTeclado.nextDouble();
                    saldo += valorRecebido;
                    System.out.println(String.format("Saldo atualizado: R$ %.2f", saldo));
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Informe o valor a transferir:");
                    double valorTransferido = leTeclado.nextDouble();

                    if (valorTransferido <= saldo) {
                        saldo -= valorTransferido;
                        System.out.println(String.format("Saldo atualizado: R$ %.2f", saldo));
                    } else {
                        System.out.println("Não há saldo suficiente para fazer essa transferência");
                    }

                    System.out.println();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida");
                    System.out.println();
            }
        }
    }
}

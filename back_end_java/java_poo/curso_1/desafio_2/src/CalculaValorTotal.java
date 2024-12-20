public class CalculaValorTotal {
    public static void main(String[] args) {
        double precoProduto = 3.99;
        int quantidade = 6;
        double valorTotal = precoProduto * quantidade;
        System.out.println(String.format("Valor unitário: %.2f", precoProduto));
        System.out.println(String.format("Quantidade: %d", quantidade));
        System.out.println(String.format("Valor total: %.2f", valorTotal));
    }
}

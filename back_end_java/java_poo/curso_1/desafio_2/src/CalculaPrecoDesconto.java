public class CalculaPrecoDesconto {
    public static void main(String[] args) {
        double precoOriginal = 49.99;
        double percentualDesconto = 13;
        double desconto = precoOriginal * (percentualDesconto / 100);
        System.out.println("Preço original: R$ " + precoOriginal);
        System.out.println("Desconto: " + (int) percentualDesconto + "%");
        System.out.println(String.format("Preço com desconto: R$ %.2f",(precoOriginal - desconto)));
    }
}

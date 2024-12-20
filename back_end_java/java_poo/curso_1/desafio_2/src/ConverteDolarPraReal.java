public class ConverteDolarPraReal {
    public static void main(String[] args) {
        double valorEmDolares = 9.99;
        double valorEmReais = valorEmDolares * 4.94;
        String textoResultado = """
                Valor em dólares: $ %.2f
                Valor convertido em reais: R$ %.2f
                """.formatted(valorEmDolares, valorEmReais);
        System.out.println(textoResultado);
    }
}

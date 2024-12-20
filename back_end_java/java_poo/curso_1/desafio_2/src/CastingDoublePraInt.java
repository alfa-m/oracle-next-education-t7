public class CastingDoublePraInt {
    public static void main(String[] args){
        double numero1 = 1.7;
        int numero2 = (int) numero1;
        String textoResultado = """
                Casting de double pra int
                Valor original: %f
                Valor com casting: %d
                """.formatted(numero1, numero2);
        System.out.println(textoResultado);
    }
}

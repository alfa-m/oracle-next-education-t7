public class CalculaMedia {
    public static void main(String[] args){
        double nota1 = 6.8;
        double nota2 = 7.5;
        double mediaNotas = (nota1 + nota2) / 2;
        String textoResultado = """
                Notas do aluno
                Avaliação 1: %.2f
                Avaliação 2: %.2f
                Média: %.2f
                """.formatted(nota1, nota2, mediaNotas);
        System.out.println(textoResultado);
    }
}
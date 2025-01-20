public class Main {
    public static void main(String[] args) {
        System.out.println("\nClasse Pessoa");
        Pessoa pessoa1 = new Pessoa();
        pessoa1.digaOla();

        System.out.println("\nClasse Calculadora");
        Calculadora calculadora1 = new Calculadora();
        double numero = 3;
        System.out.println("O dobro de " + numero +
                " é " + calculadora1.retornaDobro(numero));

        System.out.println("\nClasse Música");
        Musica musica1 = new Musica();
        musica1.titulo = "Pintinho amarelinho";
        musica1.artista = "Gugu";
        musica1.anoLancamento = 1994;
        musica1.avaliaMusica(9.8);
        musica1.exibeFichaTecnica();
        musica1.avaliaMusica(10);
        musica1.exibeFichaTecnica();
        System.out.println("Média das avaliações " + musica1.calculaMedia());

        System.out.println("\nClasse Carro");
        Carro carro1 = new Carro();
        carro1.modelo = "Toyota Hilux";
        carro1.ano = 2013;
        carro1.cor = "Prata";
        carro1.mostraFichaTecnica();
        System.out.println("Idade do carro: " + carro1.calculaIdadeCarro());

        System.out.println("\nClasse Aluno");
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Joana";
        aluno1.idade = 23;
        aluno1.mostraInformacao();
    }
}

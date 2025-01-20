import java.time.Year;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void mostraFichaTecnica(){
        String infoCarro = """
                Carro: %s
                Ano de lançamento: %d
                Cor: %s
                """.formatted(this.modelo,this.ano,this.cor);
        System.out.println(infoCarro);
    }

    int calculaIdadeCarro(){
        return (Year.now().getValue() - ano);
    }
}

package br.com.oracle.one.conversormoedas.main;

import br.com.oracle.one.conversormoedas.entities.Converter;

import java.io.IOException;
import java.util.Scanner;

public class UserInteraction {
    private double originalValue;
    private double convertedValue;
    private Scanner scanner = new Scanner(System.in);
    private Converter converter = new Converter();
    private String menuText = """
            ******************************************************
            Escolha uma das opções abaixo:
            
            1) Dólar americano [USD] => Real [BRL]
            2) Real [BRL] => Dólar americano [USD]
            3) Dólar americano [USD] => Euro [EUR]
            4) Euro [EUR] => Dólar americano [USD]
            5) Euro [EUR] => Real [BRL]
            6) Real [BRL] => Euro [EUR]
            7) Peso argentino [ARS] => Real [BRL]
            8) Real [BRL] => Peso argentino [ARS]
            9) Boliviano [BOB] => Real [BRL]
            10) Real [BRL] => Boliviano [BOB]
            11) Peso chileno [CLP] => Real [BRL]
            12) Real [BRL] => Peso chileno [CLP]
            13) Peso colombiano [COP] => Real [BRL]
            14) Real [BRL] => Peso colombiano [COP]
            0) Sair
            ******************************************************""";

    public void showMenu(){
        System.out.println(menuText);
    }

    public void getOptions(String originalCurrency, String convertedCurrency) throws IOException, InterruptedException {
        System.out.println("Digite o valor que deseja converter:");
        originalValue = scanner.nextDouble();
        convertedValue = converter.convertValue(originalValue, originalCurrency, convertedCurrency);
        System.out.printf("Valor de %.2f %s convertido em %s: %.2f\n", originalValue, originalCurrency, convertedCurrency, convertedValue);
    }
}

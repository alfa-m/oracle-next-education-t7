package br.com.oracle.one.conversormoedas.main;

import br.com.oracle.one.conversormoedas.entities.Converter;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter();
        int option;
        double originalValue;
        double convertedValue;
        String originalCurrency;
        String convertedCurrency;
        String menuText = """
            ******************************************************
            Escolha uma das opções abaixo:
            
            1) Dólar americano [USD] => Real [BRL]
            2) Real [BRL] => Dólar americano [USD]
            3) Dólar americano [USD] => Euro [EUR]
            4) Euro [EUR] => Dólar americano [USD]
            5) Euro [EUR] => Real [BRL]
            6) Real [BRL] => Euro [EUR]
            7) Sair
            ******************************************************""";
        boolean runCode = true;

        System.out.println("Seja bem-vindo(a) ao Conversor de Moeda");
        while(runCode) {
            System.out.println(menuText);
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    originalCurrency = "USD";
                    convertedCurrency = "BRL";
                    System.out.println("Digite o valor que deseja converter:");
                    originalValue = scanner.nextDouble();
                    convertedValue = converter.convertValue(originalValue, originalCurrency, convertedCurrency);
                    System.out.printf("Valor de %.2f %s convertido em %s: %.2f\n", originalValue, originalCurrency, convertedCurrency, convertedValue);
                    break;

                case 2:
                    originalCurrency = "BRL";
                    convertedCurrency = "USD";
                    System.out.println("Digite o valor que deseja converter:");
                    originalValue = scanner.nextDouble();
                    convertedValue = converter.convertValue(originalValue, originalCurrency, convertedCurrency);
                    System.out.printf("Valor de %.2f %s convertido em %s: %.2f\n", originalValue, originalCurrency, convertedCurrency, convertedValue);
                    break;

                case 3:
                    originalCurrency = "USD";
                    convertedCurrency = "EUR";
                    System.out.println("Digite o valor que deseja converter:");
                    originalValue = scanner.nextDouble();
                    convertedValue = converter.convertValue(originalValue, originalCurrency, convertedCurrency);
                    System.out.printf("Valor de %.2f %s convertido em %s: %.2f\n", originalValue, originalCurrency, convertedCurrency, convertedValue);
                    break;

                case 4:
                    originalCurrency = "EUR";
                    convertedCurrency = "USD";
                    System.out.println("Digite o valor que deseja converter:");
                    originalValue = scanner.nextDouble();
                    convertedValue = converter.convertValue(originalValue, originalCurrency, convertedCurrency);
                    System.out.printf("Valor de %.2f %s convertido em %s: %.2f\n", originalValue, originalCurrency, convertedCurrency, convertedValue);
                    break;

                case 5:
                    originalCurrency = "EUR";
                    convertedCurrency = "BRL";
                    System.out.println("Digite o valor que deseja converter:");
                    originalValue = scanner.nextDouble();
                    convertedValue = converter.convertValue(originalValue, originalCurrency, convertedCurrency);
                    System.out.printf("Valor de %.2f %s convertido em %s: %.2f\n", originalValue, originalCurrency, convertedCurrency, convertedValue);
                    break;

                case 6:
                    originalCurrency = "BRL";
                    convertedCurrency = "EUR";
                    System.out.println("Digite o valor que deseja converter:");
                    originalValue = scanner.nextDouble();
                    convertedValue = converter.convertValue(originalValue, originalCurrency, convertedCurrency);
                    System.out.printf("Valor de %.2f %s convertido em %s: %.2f\n", originalValue, originalCurrency, convertedCurrency, convertedValue);
                    break;

                case 7:
                    System.out.println("Finalizando programa");
                    runCode = false;
                    break;

                default:
                    System.out.println("Por favor, insira uma opção válida");
            }
        }
    }
}

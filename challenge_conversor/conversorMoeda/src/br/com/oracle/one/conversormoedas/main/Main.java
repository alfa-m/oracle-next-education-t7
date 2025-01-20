package br.com.oracle.one.conversormoedas.main;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        UserInteraction userInteraction = new UserInteraction();
        String option;
        String originalCurrency;
        String convertedCurrency;
        boolean runCode = true;

        System.out.println("Seja bem-vindo(a) ao Conversor de Moeda");
        while(runCode) {
            userInteraction.showMenu();
            option = scanner.nextLine();

            switch (option) {
                case "0":
                    System.out.println("Finalizando programa");
                    runCode = false;
                    break;

                case "1":
                    originalCurrency = "USD";
                    convertedCurrency = "BRL";
                    userInteraction.getOptions(originalCurrency, convertedCurrency);
                    break;

                case "2":
                    originalCurrency = "BRL";
                    convertedCurrency = "USD";
                    userInteraction.getOptions(originalCurrency, convertedCurrency);
                    break;

                case "3":
                    originalCurrency = "USD";
                    convertedCurrency = "EUR";
                    userInteraction.getOptions(originalCurrency, convertedCurrency);
                    break;

                case "4":
                    originalCurrency = "EUR";
                    convertedCurrency = "USD";
                    userInteraction.getOptions(originalCurrency, convertedCurrency);
                    break;

                case "5":
                    originalCurrency = "EUR";
                    convertedCurrency = "BRL";
                    userInteraction.getOptions(originalCurrency, convertedCurrency);
                    break;

                case "6":
                    originalCurrency = "BRL";
                    convertedCurrency = "EUR";
                    userInteraction.getOptions(originalCurrency, convertedCurrency);
                    break;

                case "7":
                    originalCurrency = "ARS";
                    convertedCurrency = "BRL";
                    userInteraction.getOptions(originalCurrency, convertedCurrency);
                    break;

                case "8":
                    originalCurrency = "BRL";
                    convertedCurrency = "ARS";
                    userInteraction.getOptions(originalCurrency, convertedCurrency);
                    break;

                case "9":
                    originalCurrency = "BOB";
                    convertedCurrency = "BRL";
                    userInteraction.getOptions(originalCurrency, convertedCurrency);
                    break;

                case "10":
                    originalCurrency = "BRL";
                    convertedCurrency = "BOB";
                    userInteraction.getOptions(originalCurrency, convertedCurrency);
                    break;

                case "11":
                    originalCurrency = "CLP";
                    convertedCurrency = "BRL";
                    userInteraction.getOptions(originalCurrency, convertedCurrency);
                    break;

                case "12":
                    originalCurrency = "BRL";
                    convertedCurrency = "CLP";
                    userInteraction.getOptions(originalCurrency, convertedCurrency);
                    break;

                case "13":
                    originalCurrency = "COP";
                    convertedCurrency = "BRL";
                    userInteraction.getOptions(originalCurrency, convertedCurrency);
                    break;

                case "14":
                    originalCurrency = "BRL";
                    convertedCurrency = "COP";
                    userInteraction.getOptions(originalCurrency, convertedCurrency);
                    break;

                default:
                    System.out.println("Por favor, insira uma opção válida");
            }
        }
    }
}

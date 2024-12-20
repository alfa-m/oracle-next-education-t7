public class ConverteTemperatura {
    public static void main(String[] args) {
        double temperaturaCelsius = 32.5;
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
        int temperaturaConvertidaSemDecimais = (int) temperaturaFahrenheit;
        String textoResultado = """
                ==========================================================
                **** CONVERSOR DE TEMPERATURA CELSIUS PARA FAHRENHEIT ****
                ==========================================================
                Temperatura em Celsius: %.1fºC
                Temperatura em Fahrenheit: %.1fºF
                Temperatura em Fahrenheit sem as casas decimais: %dºF
                """.formatted(temperaturaCelsius, temperaturaFahrenheit,
                    temperaturaConvertidaSemDecimais);
        System.out.println(textoResultado);
    }
}

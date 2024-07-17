package conversor.utils;

public class CurrencyConverter {
    public static double imposto = 0.06;

    public static String converter(double dollar, double quant){
        double valor = (dollar * quant) + (dollar * quant * imposto);
        return "Amount to be paid in reais = " +String.format("%.2f", valor);
    }

}

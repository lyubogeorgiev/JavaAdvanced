package FunctionalProgramming;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class AddVAT {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UnaryOperator<Double> vatCalc = a -> a * 1.2;

        double[] pricesWithVAT = Arrays.stream(scanner.nextLine().split(", "))
                .mapToDouble(Double::parseDouble)
                .map(vatCalc::apply)
                .map(a -> Double.parseDouble(df.format(a)))
                .toArray();

        System.out.println("Prices with VAT:");
        Arrays.stream(pricesWithVAT).forEach(a -> System.out.printf("%.2f%n", a));
    }
}

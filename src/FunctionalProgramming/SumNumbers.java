package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Function<String, Integer> countOfNumbers = a -> a.split(", ").length;

        Function<String, Integer> sumOfIntegers = a -> Arrays.stream(a.split(", "))
                .mapToInt(Integer::parseInt)
                .sum();

        System.out.printf("Count = %d%n", countOfNumbers.apply(input));
        System.out.printf("Sum = %d%n", sumOfIntegers.apply(input));
    }
}

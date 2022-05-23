package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Predicate<String> isUpperCase = a -> Character.isUpperCase(a.charAt(0));

        Function<String, String[]> upperCaseWordsArray = a -> Arrays
                .stream(a.split("\\s+"))
                .filter(isUpperCase)
                .toArray(String[]::new);

        Function<String, Integer> countOfUpperCaseWords = a -> upperCaseWordsArray.apply(a).length;

        Consumer<String[]> printUpperCaseWords = words -> {
            Arrays.stream(words).forEach(System.out::println);
        };

        System.out.println(countOfUpperCaseWords.apply(input));
        printUpperCaseWords.accept(upperCaseWordsArray.apply(input));
    }
}

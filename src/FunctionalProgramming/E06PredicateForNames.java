package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class E06PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        String[] names = scanner.nextLine().split("\\s+");

        Predicate<String> isNameAvailable = a -> a.length() <= length;

        System.out.println(Arrays.stream(names).filter(isNameAvailable).collect(Collectors.joining("\n")));

    }
}

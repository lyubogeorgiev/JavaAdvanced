package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine()
                .split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String numbers = input.stream()
                .filter(a -> a % 2 == 0)
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println(numbers);

        String sortedNumbers = input.stream()
                .filter(a -> a % 2 == 0)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println(sortedNumbers);
    }
}
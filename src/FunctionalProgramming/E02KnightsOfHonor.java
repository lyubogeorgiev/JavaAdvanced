package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class E02KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Consumer<String> consumer = p -> {
            Arrays.stream(input.split("\\s+")).forEach(a -> System.out.printf("Sir %s%n", a));
        };

        consumer.accept(input);
    }
}

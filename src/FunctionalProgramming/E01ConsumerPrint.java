package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class E01ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Consumer<String> consumer = p -> {
          Arrays.stream(p.split("\\s+")).forEach(System.out::println);
        };

        consumer.accept(input);
    }
}

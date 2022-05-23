package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class E09ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Integer[] sequence = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed()
                .toArray(Integer[]::new);

//        Predicate<Integer[]> predicate = a -> {
//            Object[] objects = Arrays.stream(a).filter(b -> n % b == 0).toArray();
//
//            return objects.length == a.length;
//        };

        System.out.println(IntStream
                .range(1, n + 1)
                .filter(a -> Arrays.stream(sequence).filter(b -> a % b == 0).toArray().length == sequence.length)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" ")));
    }
}

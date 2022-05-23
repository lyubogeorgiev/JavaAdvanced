package FunctionalProgramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E08CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Comparator<Integer> comparator = (a, b) -> {
            if ((a % 2 == 0 && b % 2 == 0) || (a % 2 != 0 && b % 2 != 0)) {
               return a - b;
            } else if (a % 2 == 0 ){
                return -1;
            } else {
                return 1;
            }
        };

        Integer[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);

        Arrays.sort(numbers, comparator);

        System.out.println(Arrays.stream(numbers).map(String::valueOf).collect(Collectors.joining(" ")));
    }
}

package FunctionalProgramming;

import java.util.*;
import java.util.stream.Collectors;

public class E05ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int divider = Integer.parseInt(scanner.nextLine());

        List<Integer> collect = Arrays.stream(numbers).filter(n -> n % divider != 0).boxed().collect(Collectors.toList());
        Collections.reverse(collect);

        System.out.println(collect.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}

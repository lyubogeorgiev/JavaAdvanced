package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String condition = scanner.nextLine();

        printEvenOrOdd(nums[0], nums[1] + 1, condition);
    }

    public static void printEvenOrOdd(int lowerBoundInclusive, int upperBoundInclusive, String condition){
        Predicate<Integer> predicate = p -> {
            if (condition.equals("even")){
                return p % 2 == 0;
            }

            return p % 2 != 0;
        };

        System.out.println(IntStream.range(lowerBoundInclusive, upperBoundInclusive)
                .boxed()
                .filter(predicate)
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));
    }
}

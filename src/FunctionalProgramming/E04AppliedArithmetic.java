package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E04AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();

//        BiFunction<Integer[], String, Integer[]> applyArithmetic = a ->

        while(!command.equals("end")){
            if (command.equals("add")){
                numbers = Arrays.stream(numbers).map(a -> a = a + 1).toArray();
            }else if(command.equals("multiply")){
                numbers = Arrays.stream(numbers).map(a -> a = a * 2).toArray();
            }else if(command.equals("subtract")){
                numbers = Arrays.stream(numbers).map(a -> a = a - 1).toArray();
            } else {
                System.out.println(Arrays.stream(numbers)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(" ")));
            }

            command = scanner.nextLine();
        }
    }
}

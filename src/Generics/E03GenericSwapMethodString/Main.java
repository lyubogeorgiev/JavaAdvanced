package Generics.E03GenericSwapMethodString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(scanner.nextLine()));
        }

        int[] swapIndexes = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        swap(list, swapIndexes[0], swapIndexes[1]);

        list.forEach(e -> System.out.printf("%s: %s%n", e.getClass().getName(), e));
    }

    public static<T> void swap(List<T> list, int n, int m){
        T element = list.get(n);

        list.add(n, list.get(m));
        list.remove(n + 1);

        list.add(m, element);
        list.remove(m + 1);
    }
}

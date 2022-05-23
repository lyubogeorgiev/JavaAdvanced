package FunctionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E10PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<String> guests = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while(!input.equals("Party!")){
            String[] tokens = input.split("\\s+");

            if (tokens[0].equals("Remove")){
                if (tokens[1].equals("StartsWith")){
                    guests = guests.stream().filter(a -> !a.startsWith(tokens[2])).collect(Collectors.toList());

                } else if(tokens[1].equals("EndsWith")) {
                    guests = guests.stream().filter(a -> !a.endsWith(tokens[2])).collect(Collectors.toList());

                } else {
                    guests = guests
                            .stream()
                            .filter(a -> a.length() != Integer.parseInt(tokens[2]))
                            .collect(Collectors.toList());

                }
            } else if(tokens[0].equals("Double")){
                if (tokens[1].equals("StartsWith")){
                    guests.addAll(guests.stream().filter(a -> a.startsWith(tokens[2])).collect(Collectors.toList()));

                } else if(tokens[1].equals("EndsWith")){
                    guests.addAll(guests.stream().filter(a -> a.endsWith(tokens[2])).collect(Collectors.toList()));

                } else {
                    guests.addAll(guests
                            .stream()
                            .filter(a -> a.length() == Integer.parseInt(tokens[2]))
                            .collect(Collectors.toList()));
                }
            }

            input = scanner.nextLine();
        }

        String result = String.join(", ", guests.stream().sorted().collect(Collectors.toList()));
        
        if (result.isEmpty()){
            System.out.println("Nobody is going to the party!");
        } else {
            System.out.printf("%s are going to the party!%n", result);
        }
    }
}

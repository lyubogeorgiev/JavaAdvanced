package FunctionalProgramming;

import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FilterByAge {
    public static class Person{
        String name;
        int age;

        Person(String name, int age){
            setName(name);
            setAge(age);
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age){
            this.age = age;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> people = IntStream.range(0, n)
                .mapToObj(ignored -> {
                    String[] input = scanner.nextLine().split(", ");
                    return new Person(input[0], Integer.parseInt(input[1]));
                })
                .collect(Collectors.toList());

        String ageGroup = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        Predicate<Person> predicate = p -> {

            if (ageGroup.equals("older")){
                return p.age >= age;
            }else{
                return p.age <= age;
            }
        };

        String[] pattern = scanner.nextLine().split("\\s+");

        Consumer<Person> consumer = p -> {
            if (pattern.length == 2){
                System.out.printf("%s - %d%n", p.name, p.age);
            } else if (pattern[0].equals("name")){
                System.out.printf("%s%n", p.name);
            } else {
                System.out.printf("%d%n", p.age);
            }
        };

        people.stream().filter(predicate).forEach(consumer);
    }
}

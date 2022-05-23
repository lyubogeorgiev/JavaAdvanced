package DefiningClasses.E01OpinionPoll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] inputTokens = scanner.nextLine().split("\\s+");

            String name = inputTokens[0];
            int age = Integer.parseInt(inputTokens[1]);

            Person person = new Person(name, age);

            people.add(person);
        }

        people.stream()
                .filter(a -> a.getAge() > 30)
                .sorted((a, b) -> a.getName().compareTo(b.getName()))
                .forEach(a -> System.out.printf("%s - %d%n", a.getName(), a.getAge()));
    }
}

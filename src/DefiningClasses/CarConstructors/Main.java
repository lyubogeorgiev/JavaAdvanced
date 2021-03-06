package DefiningClasses.CarConstructors;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");

            Car car = new Car(input[0]);

            if (input.length >= 2){
                car.setModel(input[1]);
            }

            if (input.length == 3){
                car.setHorsePower(Integer.parseInt(input[2]));
            }


            System.out.printf("The car is: %s %s - %d HP.%n",
                    car.getBrand(), car.getModel(), car.getHorsePower());
        }
    }
}

package DefiningClasses.E03SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Car> cars = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] inputTokens = scanner.nextLine().split("\\s+");

            String model = inputTokens[0];
            double fuelAmount =Double.parseDouble(inputTokens[1]);
            double fuelCostPerKm = Double.parseDouble(inputTokens[2]);

            cars.put(model, new Car(model, fuelAmount, fuelCostPerKm));
        }

        String input = scanner.nextLine();

        while (!input.equals("End")){
            String[] inputTokens = input.split("\\s+");

            String carModel = inputTokens[1];
            int distance = Integer.parseInt(inputTokens[2]);

            int driven = cars.get(carModel).drive(distance);

            if (driven == -1){
                System.out.println("Insufficient fuel for the drive");
            }

            input = scanner.nextLine();
        }

        cars.entrySet()
                .stream()
                .forEach(car -> System.out.printf("%s %.2f %d%n",
                        car.getValue().getModel(),
                        car.getValue().getFuelAmount(),
                        car.getValue().getDistanceTraveled()));
    }
}

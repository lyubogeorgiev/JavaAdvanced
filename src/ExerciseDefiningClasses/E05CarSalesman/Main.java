package ExerciseDefiningClasses.E05CarSalesman;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Car> cars = new LinkedHashMap<>();
        Map<String, Engine> engines = new HashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] inputTokens = scanner.nextLine().split("\\s+");

            String engineModel = inputTokens[0];
            int enginePower = Integer.parseInt(inputTokens[1]);
            int engineDisplacement = -1;
            String engineEfficiency = "n/a";

            engines.put(engineModel, new Engine(engineModel, enginePower, engineDisplacement, engineEfficiency));

        }

        int m = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < m; i++) {
            String[] inputTokens = scanner.nextLine().split("\\s+");

            String carModel = inputTokens[0];
            Engine carEngine = engines.get(inputTokens[1]);
            int carWeight = -1;
            String carColor = "n/a";

            if (inputTokens.length == 4){
                carWeight = Integer.parseInt(inputTokens[2]);
                carColor = inputTokens[3];
            } else if (inputTokens.length == 3){
                //here have to check which is the 3rd parameter, is it String or int
                if (Character.isAlphabetic(inputTokens[2].charAt(0))) {
                    carColor = inputTokens[2];
                } else {
                    carWeight = Integer.parseInt(inputTokens[2]);
                }
            } else {
                carColor = "n/a";
                carWeight = -1;
            }

            Car car = new Car(carModel, carEngine, carWeight, carColor);

            cars.put(carModel, car);
        }

        for (String car : cars.keySet()) {
            System.out.printf("%s%n", cars.get(car).getModel());
            System.out.println(cars.get(car).getEngine().getModel());
            System.out.printf("Power: %d%n", cars.get(car).getEngine().getPower());

            int engineDisplacement = cars.get(car).getEngine().getDisplacement();
            if (engineDisplacement == -1){
                System.out.println("n/a");
            }else{
                System.out.printf("Displacement: %d%n", cars.get(car).getEngine().getDisplacement());

            }

            System.out.printf("Efficiency: %s%n", cars.get(car).getEngine().getEfficiency());

            int weight = cars.get(car).getWeight();

            if (weight == -1){
                System.out.printf("Weight: n/a%n");
            } else {
                System.out.printf("Weight: %d%n", weight);
            }

            System.out.printf("Color: %s%n", cars.get(car).getColor());
        }
    }
}

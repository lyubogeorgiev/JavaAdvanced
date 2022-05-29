package ExerciseDefiningClasses.E06RawData;

import java.util.Arrays;
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
            int engineSpeed = Integer.parseInt(inputTokens[1]);
            int enginePower = Integer.parseInt(inputTokens[2]);
            int cargoWeight = Integer.parseInt(inputTokens[3]);
            String cargoType = inputTokens[4];
            double tire1Pressure = Double.parseDouble(inputTokens[5]);
            int tire1Age = Integer.parseInt(inputTokens[6]);
            double tire2Pressure = Double.parseDouble(inputTokens[7]);
            int tire2Age = Integer.parseInt(inputTokens[8]);
            double tire3Pressure = Double.parseDouble(inputTokens[9]);
            int tire3Age = Integer.parseInt(inputTokens[10]);
            double tire4Pressure = Double.parseDouble(inputTokens[11]);
            int tire4Age = Integer.parseInt(inputTokens[12]);

            Car car = new Car(model);

            car.getEngine().setSpeed(engineSpeed);
            car.getEngine().setPower(enginePower);

            car.getCargo().setWeight(cargoWeight);
            car.getCargo().setType(cargoType);

            car.getTires()[0].setPressure(tire1Pressure);
            car.getTires()[0].setAge(tire1Age);
            car.getTires()[1].setPressure(tire2Pressure);
            car.getTires()[1].setAge(tire2Age);
            car.getTires()[2].setPressure(tire3Pressure);
            car.getTires()[2].setAge(tire3Age);
            car.getTires()[3].setPressure(tire4Pressure);
            car.getTires()[3].setAge(tire4Age);

            cars.put(model, car);
        }

        String command = scanner.nextLine();

        if (command.equals("Fragile")){
            cars
                    .entrySet()
                    .stream()
                    .filter(car -> car.getValue().getCargo().getType().equals("fragile"))
                    .filter(car -> Arrays.stream(car.getValue().getTires()).anyMatch(tire -> tire.getPressure() < 1.0))
                    .forEach(car -> System.out.println(car.getValue().getModel()));
        } else {
            cars
                    .entrySet()
                    .stream()
                    .filter(car -> car.getValue().getCargo().getType().equals("flamable"))
                    .filter(car -> car.getValue().getEngine().getPower() > 250)
                    .forEach(car -> System.out.println(car.getValue().getModel()));
        }
    }
}

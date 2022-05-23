package DefiningClasses.E03SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCostPerKm;
    private int distanceTraveled;

    public Car(String model, double fuelAmount, double fuelCostPerKm){
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostPerKm = fuelCostPerKm;
        this.distanceTraveled = 0;
    }

    public String getModel(){
        return this.model;
    }

    public double getFuelAmount(){
        return this.fuelAmount;
    }

    public int getDistanceTraveled(){
        return this.distanceTraveled;
    }

    public int drive(int distance){
        double fuelNeeded = this.fuelCostPerKm * distance;
        if (this.fuelAmount >= fuelNeeded){
            this.fuelAmount -= fuelNeeded;
            this.distanceTraveled += distance;

            return distanceTraveled;
        } else {
            return -1;
        }
    }
}

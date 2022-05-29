package ExerciseDefiningClasses.E05CarSalesman;

public class Car {
    private String model;
    private Engine engine;
    private int weight;
    private String color;

    public Car(String model, Engine engine, int weight, String color){
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }
    public String getModel(){
        return this.model;
    }

    public Engine getEngine(){
        return this.engine;
    }

    public int getWeight(){
        return this.weight;
    }

    public String getColor(){
        return this.color;
    }
}

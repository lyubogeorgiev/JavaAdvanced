package ExerciseDefiningClasses.E06RawData;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private Tire[] tires;

    public Car(String model){
        this.model = model;
        this.engine = new Engine();
        this.cargo = new Cargo();
        this.tires = new Tire[4];

        for (int i = 0; i < tires.length; i++) {
            tires[i] = new Tire();
        }
    }

    public String getModel(){
        return this.model;
    }

    public Engine getEngine(){
        return this.engine;
    }

    public Cargo getCargo(){
        return this.cargo;
    }

    public Tire[] getTires(){
        return this.tires;
    }
}

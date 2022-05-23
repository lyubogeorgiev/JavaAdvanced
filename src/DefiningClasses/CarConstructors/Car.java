package DefiningClasses.CarConstructors;

public class Car {
    private String brand;
    private String model;
    private int horsePower;


    public Car(String brand, String model, int horsePower){
        setBrand(brand);
        setModel(model);
        setHorsePower(horsePower);
    }

    public Car(String brand){
        this(brand, "unknown", -1);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setHorsePower(int horsePower){
        this.horsePower = horsePower;
    }

    public String getBrand(){
        return this.brand;
    }

    public String getModel(){
        return this.model;
    }

    public int getHorsePower(){
        return this.horsePower;
    }
}

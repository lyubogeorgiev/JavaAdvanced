package Generics.E01GenericBox;

public class Box <T>{
    T box;

    public Box(T box){
        this.box = box;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", box.getClass().getName(), box);
    }
}

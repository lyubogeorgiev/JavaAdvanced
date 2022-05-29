package Generics.E05GenericCountMethodStrings;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable<T>> {
    List<T> box;

    public Box(){
        this.box = new ArrayList<>();
    }

    public void add(T element){
        this.box.add(element);
    }

    public int countGreater(T element){
        int count = 0;

        for (T t : this.box) {
            if (t.compareTo(element) > 0){
                count++;
            }
        }

        return count;
    }
}

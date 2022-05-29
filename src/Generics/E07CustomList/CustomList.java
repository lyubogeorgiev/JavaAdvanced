package Generics.E07CustomList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList <T extends Comparable<T>>{
    List<T> list;

    public CustomList(){

        this.list = new ArrayList<>();
    }

    public T getElement(int index){
        return this.list.get(index);
    }

    public void add(T element){
        this.list.add(element);
    }

    public T remove(int index){
        return this.list.remove(index);
    }

    public boolean contains(T element){
        return this.list.contains(element);
    }

    public void swap(int firstIndex, int secondIndex){
        T tempElement = this.list.get(firstIndex);
        this.list.set(firstIndex, this.list.get(secondIndex));
        this.list.set(secondIndex, tempElement);
    }

    public int countGreaterThan(T element){

        long count1 = this.list.stream().filter(a -> a.compareTo(element) > 0).count();

        return (int)count1;
    }

    public T getMax(){
        return Collections.max(this.list);
    }

    public T getMin(){
        return Collections.min(this.list);
    }

    public int size(){
        return this.list.size();
    }

    public void print(){
        this.list.forEach(System.out::println);
    }
}

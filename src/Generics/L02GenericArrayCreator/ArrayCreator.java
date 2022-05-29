package Generics.L02GenericArrayCreator;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCreator {

    public static <T> T[] create(int length, T item){
        T[] arr =  (T[])Array.newInstance(item.getClass(), length);

        Arrays.fill(arr, item);

        return arr;
    }

    public static <T> T[] create(Class<T> typeClass, int length, T item){
        T[] arr = (T[])Array.newInstance(typeClass, length);

        Arrays.fill(arr, item);

        return arr;
    }
}

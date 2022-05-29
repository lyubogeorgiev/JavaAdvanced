package Generics.L04Utilities;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListUtils {
    public static <T extends Comparable<T>> T getMin(List<T> list){
        checkIfItsEmptyList(list);
        return Collections.min(list);
    }

    public static <T extends Comparable<T>> T getMax(List<T> list){
        checkIfItsEmptyList(list);
        return Collections.max(list);
    }

    public static <T> void checkIfItsEmptyList(List<T> list){
        if (list.isEmpty()){
            throw new IllegalArgumentException();
        }
    }
}

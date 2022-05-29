package Generics.E07CustomList;

public class Sorter {
    public static <T extends Comparable<T>> void sort(CustomList<T> list){

        boolean isSwapped = true;

        while (isSwapped){
            isSwapped = false;

            for (int i = 0; i < list.size() - 1; i++) {
                if (list.getElement(i).compareTo(list.getElement((i + 1))) > 0){
                    list.swap(i, i + 1);
                    isSwapped = true;
                }
            }
        }
    }
}
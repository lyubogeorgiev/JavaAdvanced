package Generics.L02GenericArrayCreator;

public class Main {
    public static void main(String[] args) {
        Integer[] intArr = ArrayCreator.create(10, 3);

        for (Integer integer : intArr) {
            System.out.println(integer);
        }

        String[] stringArr = ArrayCreator.create(String.class, 10, "kuku");

        for (String s : stringArr) {
            System.out.println(s);
        }
    }
}

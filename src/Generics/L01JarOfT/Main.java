package Generics.L01JarOfT;

public class Main {
    public static void main(String[] args) {

        Jar<Integer> integerJar = new Jar<>();

        integerJar.add(1);
        integerJar.add(2);
        integerJar.add(3);

        System.out.println(integerJar.remove());
    }
}

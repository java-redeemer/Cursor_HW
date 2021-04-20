package garbagecollector;

public class Main {

    public static void main(String[] args) {
        Integer[] array = new Integer[100000 * 100000];
        System.gc();
    }
}

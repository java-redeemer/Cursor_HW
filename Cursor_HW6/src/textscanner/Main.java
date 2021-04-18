package textscanner;

import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1: ");
        TextScanner textScanner = new TextScanner("write here here, number 123");
        System.out.println(textScanner);
        System.out.println("Letters: " + textScanner.getCharactersMap ());

        System.out.println("Task 2: ");
        textScanner = new TextScanner (Path.of("text.txt"));
        System.out.println(textScanner);
    }
}

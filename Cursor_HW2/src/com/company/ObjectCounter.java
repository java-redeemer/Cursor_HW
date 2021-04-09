package com.company;

public class ObjectCounter {

    public static void main (String[] args) {
        Count firstObject = new Count ();
        System.out.println ("Объектов: " + Count.count);

        Count secondObject = new Count ();
        System.out.println ("Объектов: " + Count.count);

        Count thirdObject = new Count ();
        System.out.println ("Объектов: " + Count.count);
    }

}

class Count {

    static int count;

    Count () {
        count++;
    }
}


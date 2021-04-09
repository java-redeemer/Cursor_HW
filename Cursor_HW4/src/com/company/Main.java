
package com.company;

public class Main {

    public static void main(String[] args) {
        Number num1 = 9;
        Number num2 = 8;
        Number num3= 7;
        Number num4 = 6;
        MyList<Number> numberMyList = new MyList<> ();
        numberMyList.add(num1);
        numberMyList.add(num2);
        numberMyList.add(num3);
        numberMyList.add(num4);
        System.out.println(numberMyList.toString());
        System.out.println("Smallest is " + numberMyList.smallest());
        System.out.println("Largest is " + numberMyList.largest());


    }
}
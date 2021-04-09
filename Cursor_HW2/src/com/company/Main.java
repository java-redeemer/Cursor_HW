package com.company;

public class Main {
    public static void main (String[] args) {
        System.out.println("Дроби");
        Fraction fraction1 = new Fraction (1L, (short) 3);
        Fraction fraction2 = new Fraction (1L, (short) 2);
        Fraction fraction3 = new Fraction (2L, (short) 5);
        boolean fractionComparsionResult;
        Fraction fractionOperationResult = fraction1.addition (fraction2);
        System.out.printf ("(%s) + (%s) = (%s)\n", fraction1, fraction2, fractionOperationResult);
        fractionOperationResult = fraction1.deduction (fraction2);
        System.out.printf ("(%s) - (%s) = (%s)\n", fraction1, fraction2, fractionOperationResult);
        fractionOperationResult = fraction1.multiplication (fraction2);
        System.out.printf ("(%s) * (%s) = (%s)\n", fraction1, fraction2, fractionOperationResult);
        fractionOperationResult = fraction1.division (fraction2);
        System.out.printf ("(%s) - (%s) = (%s)\n", fraction1, fraction2, fractionOperationResult);
        fractionComparsionResult = fraction1.equals (fraction2);
        System.out.printf ("(%s) == (%s): %s\n", fraction1, fraction2, fractionComparsionResult);
        fractionComparsionResult = fraction1.isHigher (fraction2);
        System.out.printf ("(%s) > (%s): %s\n", fraction1, fraction2, fractionComparsionResult);


        System.out.println(" ");

        System.out.println("Деньги");
        Money money1 = new Money(2L, (byte) 60);
        Money money2 = new Money(1L, (byte) 25);
        double multiplier = 2;
        Money moneyOperationResult = money1.addition(money2);
        boolean moneyComparsionResult;
        System.out.printf("%s + %s = %s\n", money1, money2, moneyOperationResult);
        moneyOperationResult = money1.deduction(money2);
        System.out.printf("%s - %s = %s\n", money1, money2, moneyOperationResult);
        moneyOperationResult = money1.division(money2);
        System.out.printf("%s / %s = %s\n", money1, money2, moneyOperationResult);
        moneyOperationResult = money1.multiplication(money2);
        System.out.printf("%s * %s = %s\n", money1, money2, moneyOperationResult);
        moneyOperationResult = money1.division(multiplier);
        System.out.printf("%s / %s = %s\n", money1, multiplier, moneyOperationResult);
        moneyOperationResult = money1.multiplication(multiplier);
        System.out.printf("%s * %s = %s\n", money1, multiplier, moneyOperationResult);
        moneyComparsionResult = money1.equals(money2);
        System.out.printf("%s == %s: %s\n", money1, money2, moneyComparsionResult);
        moneyComparsionResult = money1.isHigher(money2);
        System.out.printf("%s > %s: %s\n", money1, money2, moneyComparsionResult);
        moneyComparsionResult = money1.isHigherOrEqual(money2);
        System.out.printf("%s >= %s: %s\n", money1, money2, moneyComparsionResult);
    }
}


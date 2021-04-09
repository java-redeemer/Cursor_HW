package com.company;

public class Fraction {

    private final long numerator;
    private final short denominator;

    public Fraction(long numerator, short denominator) {
        if (denominator == 0)
            System.out.println ("Делитель не может быть 0 (ноль)!");

        if (denominator < 0) {
            this.numerator = -numerator;
            this.denominator = (short) -denominator;
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }

    }

    public Fraction addition(Fraction fraction) {
        long resultNumerator = this.numerator * fraction.denominator + this.denominator * fraction.numerator;
        short resultDenominator = (short) (this.denominator * fraction.denominator);
        return new Fraction(resultNumerator, resultDenominator);
    }

    public Fraction deduction(Fraction fraction) {
        long resultNumerator = this.numerator * fraction.denominator - this.denominator * fraction.numerator;
        short resultDenominator = (short) (this.denominator * fraction.denominator);
        return new Fraction(resultNumerator, resultDenominator);
    }

    public Fraction multiplication(Fraction fraction) {
        long resultNumerator = this.numerator * fraction.numerator;
        short resultDenominator = (short) (this.denominator * fraction.denominator);
        return new Fraction(resultNumerator, resultDenominator);
    }

    public Fraction division(Fraction fraction) {
        long resultNumerator = this.numerator * fraction.denominator;
        short resultDenominator = (short) (this.denominator * fraction.numerator);
        return new Fraction(resultNumerator, resultDenominator);
    }

    public boolean isHigher(Fraction fraction) {
        return ((double) this.numerator / this.denominator > (double) fraction.numerator / fraction.denominator);
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Fraction) {
            Fraction nextFraction = (Fraction) obj;
            return (this.numerator == nextFraction.numerator && this.denominator == nextFraction.denominator);
        }
        return false;
    }
}

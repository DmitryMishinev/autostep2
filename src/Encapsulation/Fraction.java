package Encapsulation;

public class Fraction extends Number {
    final int numerator;
    final int denominator;

    public Fraction(int numerator,int denominator){
        this.denominator=denominator;
        this.numerator=numerator;
        if (denominator<0){
            throw new IllegalArgumentException("При отрицательном знаменателе дробь не может существовать");
        }
    }
    public String toString(){
        return numerator+"/"+denominator;
    }
    public Fraction sum(Fraction fraction){
        int tempN = this.numerator * fraction.denominator + fraction.numerator * denominator;
        int tempD = fraction.denominator * denominator;
        return new Fraction(tempN,tempD);
    }
    public Fraction minus(Fraction fraction){
        int tempN = this.numerator * fraction.denominator - fraction.numerator * denominator;
        int tempD = fraction.denominator * denominator;
        return new Fraction(tempN,tempD);
    }
    public Fraction minus(int x){
        return minus(new Fraction(x,1));
    }
    public Fraction sum(int x){
        return sum(new Fraction(x,1));
    }

    @Override
    public int intValue() {
        return numerator/denominator;
    }

    @Override
    public long longValue() {
        return numerator/denominator;
    }

    @Override
    public float floatValue() {
        return (float)numerator/denominator;
    }

    @Override
    public double doubleValue() {
        return (double)numerator/denominator;
    }
}

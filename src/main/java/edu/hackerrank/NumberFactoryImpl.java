package edu.hackerrank;

public class NumberFactoryImpl implements NumberFactory {

    public Number build(int number) {
        if (number % 2 == 1) return new WeirdNumber();
        else {
            if (2 <= number && number <= 5) return new NotWeirdNumber();
            else if (6 <= number && number <= 20) return new WeirdNumber();
            else return new NotWeirdNumber();
        }
    }

}

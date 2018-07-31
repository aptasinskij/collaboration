package edu.hackerrank;

import java.util.Scanner;

public class HackerRank {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        NumberFactory numberFactory = new NumberFactoryImpl();
        Number number = numberFactory.build(N);
        System.out.println(number.getAsString());
        scanner.close();
    }

}



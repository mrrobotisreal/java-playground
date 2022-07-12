package com.VMware;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("How high would you like to count FizzBuzz?");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i);
        if (i <= 0) {
            System.out.println("Input must be greater than 0");
        } else {
            System.out.println(FizzBuzz(i));
        }
    }

    public static String FizzBuzz(int number) {
            int fizzBuzzTotal = 0;
            int buzzTotal = 0;
            int fizzTotal = 0;
            String fizzBuzzStr = "";
            for (int i = 1; i <= number; i++) {
                int num = i;
                if (num % 5 == 0 && num % 3 == 0) {
//                    System.out.println("FizzBuzz");
                    fizzBuzzStr += "FizzBuzz\n";
                    fizzBuzzTotal++;
                } else if (num % 5 == 0) {
//                    System.out.println("Buzz");
                    fizzBuzzStr +=  "Buzz\n";
                    buzzTotal++;
                } else if (num % 3 == 0) {
//                    System.out.println("Fizz");
                    fizzBuzzStr +=  "Fizz\n";
                    fizzTotal++;
                } else {
                    fizzBuzzStr += num + "\n";
//                    System.out.println(num);
                }
            }
            System.out.println("There are " + fizzBuzzTotal + " FizzBuzz,");
            System.out.println(buzzTotal + " Buzz,");
            System.out.println("and " + fizzTotal + " Fizz.");
            return fizzBuzzStr;
    }
}

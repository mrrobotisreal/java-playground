package com.VMware;

public class Application {
    public static void main(String[] args) {
        char[] alive = {'I', 't', '\'', 's', ' ', 'a', 'l', 'i', 'v', 'e', '!', '!', '!'};
        for (char c:alive) {
            // System.out.println(c);
            // ^^^ if we print it this way, it will add a new line to the end of every char
            // we don't want that, we want it all in one line
            // therefor we should use the handy 'printf' feature from C, but in Java's System.out library
            System.out.printf("%c", c);
            // OR
            // we could also use System.out.print(...)
            // notice it's note println, that means no new line will be added
            // but personally I prefer printf because I enjoy writing in C
        }
        System.out.println("\n" + isActive("active"));
        System.out.println(grade(88));
        loopy();
    }

    public static boolean isActive(String status) {
        if (status.equals("active")) return true;
        return false;
    }

    public static String grade(int input) {
        if (input >= 90) {
            return "A";
        } else if (input >= 80) {
            return "B";
        } else if (input >= 70) {
            return "C";
        } else if (input >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void loopy() {
        // print numbers 45-50 with a while loop
        // we can do this a couple of ways with a while loop
        // Scenario 1
        int startNum1 = 45;
        while (startNum1 < 50) {
            System.out.println(startNum1);
            startNum1++;
        }
        System.out.println(startNum1);

        // Scenario 2
        startNum1 = 44;
        while (startNum1 < 50) {
            startNum1++;
            System.out.println(startNum1);
        }

        // FOR LOOP
        for (int i = 2; i <= 6; i += 2) {
            System.out.println(i);
        }

        boolean firstIsActive = false;
        boolean secondIsActive = firstIsActive;

        firstIsActive = !false;
        System.out.println("second is " + secondIsActive);
    }
}

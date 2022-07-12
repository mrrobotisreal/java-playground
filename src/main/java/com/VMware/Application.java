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
        }
    }
}

package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void logIn() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String name = sc.next();
        System.out.println("Hello, " + name + "!");
    }
}

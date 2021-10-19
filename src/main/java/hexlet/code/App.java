package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner sc = new Scanner(System.in);
        int usersChoice = sc.nextInt();
        if (usersChoice == 1) {
            Cli.logIn();
        } else if (usersChoice > 1) {
            Engine.startGame(usersChoice);
        }

    }
}

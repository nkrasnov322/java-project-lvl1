package hexlet.code;

import hexlet.code.games.GCD;
import hexlet.code.games.Calc;
import hexlet.code.games.Progression;
import hexlet.code.games.Even;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {

    private static final int NUMBER_OF_PRIME_GAME     = 6;
    private static final int NUMBER_OF_PROGRESS_GAME  = 5;
    private static final int NUMBER_OF_GCD_GAME       = 4;
    private static final int NUMBER_OF_CALC_GAME      = 3;
    private static final int NUMBER_OF_EVEN_GAME      = 2;
    private static final int NUMBER_OF_LOGIN          = 1;

    private static void startGame(int numberOfGame) throws Exception {

        switch (numberOfGame) {
            case NUMBER_OF_EVEN_GAME:
                Even.startGame();
                break;
            case NUMBER_OF_CALC_GAME:
                Calc.startGame();
                break;
            case NUMBER_OF_GCD_GAME:
                GCD.startGame();
                break;
            case NUMBER_OF_PROGRESS_GAME:
                Progression.startGame();
                break;
            case NUMBER_OF_PRIME_GAME:
                Prime.startGame();
                break;
            case NUMBER_OF_LOGIN:
                Cli.logIn();
                break;
            default:
                throw new Exception("Неизвестный номер игры");
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner sc = new Scanner(System.in);
        int usersChoice = sc.nextInt();
        if (usersChoice >= 1) {
            startGame(usersChoice);
        }

    }
}

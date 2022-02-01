package hexlet.code;

import hexlet.code.games.Game;

import java.util.List;
import java.util.Scanner;

public class Engine {
    public static final int NUMBER_OF_GAMES = 3;
    public static void startGame(List<Game> games, String condition) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String userName = sc.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(condition);

        for (Game game: games) {
            System.out.println("Question: " + game.getQuestion());
            System.out.print("Your answer: ");
            String answer = sc.next();
            boolean isCorrectAnswer = answer.equals(game.getAnswer());
            if (isCorrectAnswer) {
                System.out.println("Correct!");
            } else {
                String correctAnswer = game.getAnswer();
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                System.out.println();
                return;
            }
        }
        sc.close();
        System.out.println("Congratulations, " + userName + "!");
    }

}

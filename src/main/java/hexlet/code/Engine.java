package hexlet.code;

import hexlet.code.games.Game;
import java.util.List;
import java.util.Scanner;

public class Engine {

    public static void startGame(List<Game> games) {

        String userName = Cli.logIn();
        Scanner sc = new Scanner(System.in);

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

package hexlet.code.games;

import java.util.Random;

public class GCD {

    private static final int MAX_QUESTIONS_NUMBER = 100;
    public static void printConditionOfGame() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    private static int findGCD(int num1, int num2) {
        int minNum = Math.min(num1, num2);
        int gcd = 1;
        for (int i = 2; i <= minNum; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static Game getQuestion() {
        Random random = new Random();
        int questionNumber1 = random.nextInt(MAX_QUESTIONS_NUMBER);
        int questionNumber2 = random.nextInt(MAX_QUESTIONS_NUMBER);
        String answer = String.valueOf(findGCD(questionNumber1, questionNumber2));
        String question = questionNumber1 + " " + questionNumber2;
        return new Game(question, answer);
    }

}

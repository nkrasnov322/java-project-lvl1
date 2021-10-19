package hexlet.code.games;

import java.util.Random;

public final class GCD extends Game {

    private final int maxQuestionsNumber = 100;

    private String question;
    private String answer;

    @Override
    public void startGame() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    private int findGCD(int num1, int num2) {
        int minNum = Math.min(num1, num2);
        int gcd = 1;
        for (int i = 2; i <= minNum; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    @Override
    public String getQuestion() {
        Random random = new Random();
        int questionNumber1 = random.nextInt(maxQuestionsNumber);
        int questionNumber2 = random.nextInt(maxQuestionsNumber);
        answer = String.valueOf(findGCD(questionNumber1, questionNumber2));
        question = questionNumber1 + " " + questionNumber2;
        return question;
    }

    @Override
    public String getAnswer() {
        return answer;
    }

    @Override
    public boolean checkUserAnswer(String userAnswer) {
        return answer.equals(userAnswer);
    }
}

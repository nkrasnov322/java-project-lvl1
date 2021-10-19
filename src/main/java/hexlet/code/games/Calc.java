package hexlet.code.games;

import java.util.Random;

public final class Calc extends Game {

    private final int maxQuestionsNumber = 100;
    private final byte numberOfOperations = 3;

    private String question;
    private String answer;

    @Override
    public void startGame() {
        System.out.println("What is the result of the expression?");
    }

    @Override
    public String getQuestion() {
        Random random = new Random();
        int questionNumber1 = random.nextInt(maxQuestionsNumber);
        int questionNumber2 = random.nextInt(maxQuestionsNumber);
        int numberOfOperation = random.nextInt(numberOfOperations);
        String operation = "";
        if (numberOfOperation == 0) {
            operation = "+";
            answer = String.valueOf(questionNumber1 + questionNumber2);
        } else if (numberOfOperation == 1) {
            operation = "-";
            answer = String.valueOf(questionNumber1 - questionNumber2);
        } else {
            operation = "*";
            answer = String.valueOf(questionNumber1 * questionNumber2);
        }
        question = String.valueOf(questionNumber1) + " " + operation + " " + String.valueOf(questionNumber2);
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

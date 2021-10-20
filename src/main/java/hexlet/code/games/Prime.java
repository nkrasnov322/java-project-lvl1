package hexlet.code.games;

import java.util.Random;

public final class Prime extends Game {

    private final int maxQuestionsNumber = 100;

    private String question;
    private String answer;

    @Override
    public void startGame() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    @Override
    public String getQuestion() {
        Random random = new Random();
        int questionNumber = random.nextInt(maxQuestionsNumber);
        answer = "yes";
        for (int i = 2; i < questionNumber; i++) {
            if (questionNumber % i == 0) {
                answer = "no";
                break;
            }
        }
        question = String.valueOf(questionNumber);
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

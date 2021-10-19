package hexlet.code.games;

import java.util.Random;

public final class Greet extends Game {

    private String question;
    private String answer;

    @Override
    public void startGame() {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
    }

    @Override
    public String getQuestion() {
        Random random = new Random();
        int questionNumber = random.nextInt(100);
        answer = questionNumber % 2 == 0 ? "yes" : "no";
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

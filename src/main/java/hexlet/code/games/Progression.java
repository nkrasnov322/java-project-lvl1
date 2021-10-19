package hexlet.code.games;

import java.util.Random;

public final class Progression extends Game {

    private final int numberOfItems = 10;

    private String question;
    private String answer;

    @Override
    public void startGame() {
        System.out.println("What number is missing in the progression?");
    }

    @Override
    public String getQuestion() {
        Random random = new Random();
        int firstElement = random.nextInt(numberOfItems);
        int step = random.nextInt(numberOfItems);
        int hiddenElement = random.nextInt(numberOfItems) + 1;
        int lastElement = firstElement;
        question = String.valueOf(firstElement);
        if (hiddenElement == 1) {
            question = "..";
            answer = String.valueOf(lastElement);
        }
        for (int i = 2; i <= numberOfItems; i++) {
            lastElement = lastElement + step;
            if (i == hiddenElement) {
                answer = String.valueOf(lastElement);
                question += " ..";
            }
            else {
                question += " " + lastElement;
            }
        }
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

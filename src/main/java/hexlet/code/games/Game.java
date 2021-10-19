package hexlet.code.games;

public abstract class Game {
    private int dd;
    public abstract void startGame();
    public abstract String getQuestion();
    public abstract String getAnswer();
    public abstract boolean checkUserAnswer(String userAnswer);

}

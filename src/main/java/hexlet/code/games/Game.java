package hexlet.code.games;

public class Game {
    private String question;
    private String answer;

    public Game(String pQuestion, String pAnswer) {
        this.question = pQuestion;
        this.answer = pAnswer;
    }

    public final String getQuestion() {
        return question;
    }

    public final String getAnswer() {
        return answer;
    }
}

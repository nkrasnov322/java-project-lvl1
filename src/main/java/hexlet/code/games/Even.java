package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.ArrayList;
import java.util.List;

public final class Even {

    private static final String CONDITION_OF_GAME = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void  startGame() {
        List<Game> games = new ArrayList<>();
        for (int i = 0; i < Engine.NUMBER_OF_GAMES; i++) {
            int questionNumber = Utils.generateRandom(1, Utils.MAX_QUESTIONS_NUMBER);
            // получение ответа и вопроса в одну строку,
            // поэтому не стал выносить в отдельные функции
            String answer = questionNumber % 2 == 0 ? "yes" : "no";
            String question = String.valueOf(questionNumber);
            games.add(new Game(question, answer));
        }
        Engine.startGame(games, CONDITION_OF_GAME);
    }

}

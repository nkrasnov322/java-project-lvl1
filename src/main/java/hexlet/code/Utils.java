package hexlet.code;

import java.util.Random;

public class Utils {
    public static final int MAX_QUESTIONS_NUMBER = 100;
    public static final byte NUMBERS_OF_OPERATIONS = 3;

    public static int generateRandom(int min, int max) {
        Random random = new Random();
        int range = max - min;
        return random.nextInt(range) + min;
    }
}

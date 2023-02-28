package hexlet.code.games;

import java.util.Random;

public class Even {
    private static int number;

    public static String generateAnswer() {
        return number % 2 == 0 ? "yes" : "no";
    }

    public static String generateExpression() {
        final int NUM_BOUND = 1000;
        Random random = new Random();
        number = random.nextInt(NUM_BOUND);
        return Integer.toString(number);
    }
}

package hexlet.code.games;

import java.util.Random;

public class Even {
    private static int number;

    public static String generateAnswer() {
        return number % 2 == 0 ? "yes" : "no";
    }

    public static String generateExpression() {
        Random random = new Random();
        int numbersBound = 1000;
        number = random.nextInt(numbersBound);
        return Integer.toString(number);
    }
}

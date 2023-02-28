package hexlet.code.games;

import java.util.Random;

public class Prime {
    private static int number;

    public static String generateExpression() {
        final int numBound = 30;
        Random random = new Random();
        number = random.nextInt(2, numBound);
        return Integer.toString(number);
    }

    public static String generateAnswer() {
        int numOfDevidors = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                numOfDevidors++;
            }
        }
        return numOfDevidors > 2 ? "no" : "yes";
    }
}

package hexlet.code.games;

import java.util.Random;

public class Gcd {
    private static int num1;
    private static int num2;

    public static String generateExpression() {
        final int numBound = 50;
        Random random = new Random();
        num1 = random.nextInt(numBound);
        num2 = random.nextInt(numBound);

        return String.format("%d %d", num1, num2);
    }

    public static String generateAnswer() {
        int biggerNum = Math.max(num1, num2);
        int smallerNum = Math.min(num1, num2);
        int gcd = 1;

        if (smallerNum == 0) {
            gcd = biggerNum;
            return Integer.toString(gcd);
        }

        for (int i = smallerNum; i > 0; i--) {
            if (biggerNum % i == 0 && smallerNum % i == 0) {
                gcd = i;
                return Integer.toString(gcd);
            }
        }

        return Integer.toString(gcd);
    }
}

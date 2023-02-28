package hexlet.code.games;

import java.util.Random;

public class Calc {
    private static int num1;
    private static int num2;
    private static int operatorCode;

    public static String generateExpression() {
        final int numBound = 20;
        final int operatorCodeBound = 3;

        Random random = new Random();
        num1 = random.nextInt(numBound);
        num2 = random.nextInt(numBound);
        operatorCode = random.nextInt(operatorCodeBound);

        switch (operatorCode) {
            case 0 -> {
                return String.format("%d + %d", num1, num2);
            }
            case 1 -> {
                return String.format("%d - %d", num1, num2);
            }
            case 2 -> {
                return String.format("%d * %d", num1, num2);
            }
            default -> {
                return "Invalid value.";
            }
        }
    }

    public static String generateAnswer() {
        switch (operatorCode) {
            case 0 -> {
                return Integer.toString(num1 + num2);
            }
            case 1 -> {
                return Integer.toString(num1 - num2);
            }
            case 2 -> {
                return Integer.toString(num1 * num2);
            }
            default -> {
                return "Invalid value.";
            }
        }
    }
}

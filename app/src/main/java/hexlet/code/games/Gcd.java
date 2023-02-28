package hexlet.code.games;

import java.util.Random;

public class Gcd {
    private static int[] nums;

    private static void generateNumbers() {
        nums = new int[2];
        Random random = new Random();
        int numbersBound = 50;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(numbersBound);
        }
    }

    public static String generateAnswer() {
        int num1 = Math.abs(nums[0]);
        int num2 = Math.abs(nums[1]);
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

    public static String generateExpression() {
        generateNumbers();
        return String.format("%d %d", nums[0], nums[1]);
    }
}

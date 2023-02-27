package hexlet.code.games;

import java.util.Random;

public class Gcd {
    private static int[] nums;
    private static int[] generateNumbers() {
        int[] nums = new int[2];
        Random random = new Random();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(40);
        }

        return nums;
    }

    public static String generateAnswer() {
        int num1 = Math.abs(nums[0]);
        int num2 = Math.abs(nums[1]);
        int biggerNum = num1 > num2 ? num1 : num2;
        int smallerNum = num1 == biggerNum ? num2 : num1;
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
        nums = generateNumbers();
        return String.format("%d %d", nums[0], nums[1]);
    }
}

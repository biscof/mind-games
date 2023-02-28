package hexlet.code.games;

import java.util.Random;

public class Calc {
    private static int[] nums;

    private static void generateNumbers() {
        int itemsToFormExpression = 2;
        int itemToIdentifyOperator = 1;
        nums = new int[itemsToFormExpression + itemToIdentifyOperator];
        Random random = new Random();
        int numbersBound = 20;
        int operatorIndex = 3;

        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = random.nextInt(numbersBound);
        }
        nums[nums.length - 1] = random.nextInt(operatorIndex);
    }

    public static String generateAnswer() {
        if (nums[2] == 0) {
            return Integer.toString(nums[0] + nums[1]);
        } else if (nums[2] == 1) {
            return Integer.toString(nums[0] - nums[1]);
        } else if (nums[2] == 2) {
            return Integer.toString(nums[0] * nums[1]);
        }

        return "";
    }
    public static String generateExpression() {
        generateNumbers();

        if (nums[2] == 0) {
            return String.format("%d + %d", nums[0], nums[1]);
        } else if (nums[2] == 1) {
            return String.format("%d - %d", nums[0], nums[1]);
        } else if (nums[2] == 2) {
            return String.format("%d * %d", nums[0], nums[1]);
        }

        return "";
    }
}

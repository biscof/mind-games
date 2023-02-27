package hexlet.code.games;

import java.util.Random;

public class Calc {
    private static int[] nums;
    private static int[] generateNumbers() {
        int[] nums = new int[3];
        Random random = new Random();

        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = random.nextInt(11);
        }
        nums[nums.length - 1] = random.nextInt(3);

        return nums;
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
        nums = generateNumbers();

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

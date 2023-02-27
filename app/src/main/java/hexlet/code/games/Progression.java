package hexlet.code.games;

import java.util.Random;

public class Progression {
    private static String[] progression;
    private static int hiddenNum;

    private static void generateProgression() {
        int[] nums = new int[10];
        progression = new String[nums.length];
        Random random = new Random();
        int nextNum = random.nextInt(15);
        int increment = random.nextInt(12);
        int indexToHide = random.nextInt(nums.length);

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nextNum;
            progression[i] = Integer.toString(nextNum);

            if (i == indexToHide) {
                hiddenNum = nums[i];
                progression[i] = "..";
            }

            nextNum += increment;
        }
    }

    public static String generateAnswer() {
        return Integer.toString(hiddenNum);
    }

    public static String generateExpression() {
        generateProgression();
        return String.join(" ", progression);
    }

}

package hexlet.code.games;

import java.util.Random;

public class Progression {
    private static String[] progression;
    private static int hiddenNum;

    private static void generateProgression() {
        final int PROGRESSION_LENGTH = 10;
        final int INIT_NUM_BOUND = 15;
        final int INCREMENT_BOUND = 12;

        int[] nums = new int[PROGRESSION_LENGTH];
        progression = new String[nums.length];
        Random random = new Random();
        int nextNum = random.nextInt(INIT_NUM_BOUND);
        int increment = random.nextInt(INCREMENT_BOUND);
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

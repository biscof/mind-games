package hexlet.code.games;

import java.util.Random;

public class Progression {
    private static String[] progression;
    private static int hiddenNum;

    private static void generateProgression() {
        int numberOfItemsInProgression = 10;
        int[] nums = new int[numberOfItemsInProgression];
        progression = new String[nums.length];
        Random random = new Random();
        int initNumberBound = 15;
        int incrementBound = 12;
        int nextNum = random.nextInt(initNumberBound);
        int increment = random.nextInt(incrementBound);
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

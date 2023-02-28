package hexlet.code.games;

import java.util.Random;

public class Progression {
    private static int hiddenNum;

    public static String generateExpression() {
        final int progressionLength = 10;
        final int initNumBound = 15;
        final int incrementBound = 12;

        int[] nums = new int[progressionLength];
        String[] progression = new String[progressionLength];
        Random random = new Random();
        int nextNum = random.nextInt(initNumBound);
        int increment = random.nextInt(1, incrementBound);
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

        return String.join(" ", progression);
    }

    public static String generateAnswer() {
        return Integer.toString(hiddenNum);
    }
}

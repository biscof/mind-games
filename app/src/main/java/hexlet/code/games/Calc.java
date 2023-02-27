package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    private static int[] nums;
    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        String expression;
        String answer;
        String userAnswer;
        int round = 0;

        Cli.greetUser();
        System.out.println("What is the result of the expression?");

        while (round < 3) {
            expression = generateExpression();
            answer = generateAnswer();
            System.out.printf("Question: %s\n", expression);
            System.out.print("Your answer: ");
            userAnswer = scanner.next();

            if (answer.equals(userAnswer))
            {
                System.out.println("Correct!");
                round++;
            } else {
                System.out.printf("\"%s\" is wrong answer ;(. "
                                + "Correct answer was \"%s\".\n"
                                + "Let's try again, %s!\n",
                        userAnswer, answer, Cli.userName);
                break;
            }

            if (round == 3) {
                System.out.printf("Congratulations, %s!\n", Cli.userName);
            }
        }

    }
    private static int[] generateNumbers() {
        int[] nums = new int[3];
        Random random = new Random();

        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = random.nextInt(11);
        }
        nums[nums.length - 1] = random.nextInt(3);

        return nums;
    }

    private static String generateAnswer() {
        if (nums[2] == 0) {
            return Integer.toString(nums[0] + nums[1]);
        } else if (nums[2] == 1) {
            return Integer.toString(nums[0] - nums[1]);
        } else if (nums[2] == 2) {
            return Integer.toString(nums[0] * nums[1]);
        }

        return "";
    }
    private static String generateExpression() {
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

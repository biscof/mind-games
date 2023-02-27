package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void playGame() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String userAnswer;
        int intRandom;
        int round = 0;

        String userName = Cli.greetUser();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        while (round < 3) {
            intRandom = random.nextInt(1000);
            System.out.printf("Question: %d\n", intRandom);
            System.out.print("Your answer: ");
            userAnswer = scanner.next();

            if (isEven(intRandom).equals(userAnswer))
            {
                System.out.println("Correct!");
                round++;
            } else {
                System.out.printf("\"%s\" is wrong answer ;(. "
                                + "Correct answer was \"%s\".\n"
                                + "Let's try again, %s!\n",
                                userAnswer, isEven(intRandom), userName);
                round = 0;
            }

            if (round == 3) {
                System.out.printf("Congratulations, %s!\n", userName);
            }
        }
    }

    private static String isEven(int number) {
        return number % 2 == 0 ? "yes" : "no";
    }
}

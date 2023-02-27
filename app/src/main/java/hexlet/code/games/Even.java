package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Even {
    private static int number;
    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        String userAnswer;
        int round = 0;
        String expression;
        String answer;

        Cli.greetUser();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

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

    private static String generateAnswer() {
        return number % 2 == 0 ? "yes" : "no";
    }

    private static String generateExpression() {
        Random random = new Random();
        number = random.nextInt(1000);
        return Integer.toString(number);
    }


}

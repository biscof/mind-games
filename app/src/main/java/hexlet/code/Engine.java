package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class Engine {
    public static void playGame(String gameNumber) {
        switch (gameNumber) {
            case "0" -> System.out.println("Bye!");
            case "1" -> Cli.greetUser();
            case "2" -> startGame("2");
            case "3" -> startGame("3");
            case "4" -> startGame("4");
            case "5" -> startGame("5");
            case "6" -> startGame("6");
            default -> System.out.println("Invalid number provided.");
        }
    }

    public static void startGame(String gameNum) {
        Scanner scanner = new Scanner(System.in);
        String userAnswer;
        int round = 0;
        String expression = "";
        String answer = "";

        Cli.greetUser();

        switch (gameNum) {
            case "2" -> System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            case "3" -> System.out.println("What is the result of the expression?");
            case "4" -> System.out.println("Find the greatest common divisor of given numbers.");
            case "5" -> System.out.println("What number is missing in the progression?");
            case "6" -> System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
            default -> System.out.println(" ");
        }

        while (round < 3) {
            switch (gameNum) {
                case "2" -> {
                    expression = Even.generateExpression();
                    answer = Even.generateAnswer();
                }
                case "3" -> {
                    expression = Calc.generateExpression();
                    answer = Calc.generateAnswer();
                }
                case "4" -> {
                    expression = Gcd.generateExpression();
                    answer = Gcd.generateAnswer();
                }
                case "5" -> {
                    expression = Progression.generateExpression();
                    answer = Progression.generateAnswer();
                }
                case "6" -> {
                    expression = Prime.generateExpression();
                    answer = Prime.generateAnswer();
                }
            }
            System.out.printf("Question: %s\n", expression);
            System.out.print("Your answer: ");
            userAnswer = scanner.next();

            if (answer.equals(userAnswer)) {
                System.out.println("Correct!");
                round++;
            } else {
                System.out.printf("""
                    "%s" is wrong answer ;(. \
                    Correct answer was "%s".
                    Let's try again, %s!
                    """.formatted(userAnswer, answer, Cli.userName));
                round = 0;
            }

            if (round == 3) {
                System.out.printf("Congratulations, %s!\n", Cli.userName);
            }
        }
    }
}

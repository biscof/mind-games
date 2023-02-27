package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class Engine {
    public static void chooseGame(){
        Scanner scanner = new Scanner(System.in);
        String gameNumber;

        System.out.print("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calculator\n"
                + "0 - Exit\n"
                + "Your choice: ");
        gameNumber = scanner.next();

        if (gameNumber.equals("0")) {
            System.out.println("Bye!");
        } else if (gameNumber.equals("1")) {
            Cli.greetUser();
        } else if (gameNumber.equals("2")) {
            startGame(gameNumber);
        } else if (gameNumber.equals("3")) {
            startGame(gameNumber);
        } else {
            System.out.println("Invalid number provided.");
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
        }

        while (round < 3) {
            if (gameNum.equals("2")) {
                expression = Even.generateExpression();
                answer = Even.generateAnswer();
            } else if (gameNum.equals("3")) {
                expression = Calc.generateExpression();
                answer = Calc.generateAnswer();
            }
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
}

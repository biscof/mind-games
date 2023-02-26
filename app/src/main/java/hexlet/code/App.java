package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String gameNumber;

        System.out.print("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "0 - Exit\n"
                + "Your choice: ");
        gameNumber = scanner.next();

        while (true) {
            if (gameNumber.equals("0")) {
                break;
            } else if (gameNumber.equals("1")) {
                Cli.greetUser();
                break;
            } else if (gameNumber.equals("2")) {
                Even.playGame();
                break;
            } else {
                System.out.print("Please enter a valid number: ");
                gameNumber = scanner.next();
            }
        }
    }
}

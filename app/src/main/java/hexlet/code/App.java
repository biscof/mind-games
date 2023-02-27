package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String gameNumber;

        System.out.print("""
            Please enter the game number and press Enter.
            1 - Greet
            2 - Even
            3 - Calculator
            4 - GCD
            5 - Progression
            0 - Exit
            Your choice:\s""");
        gameNumber = scanner.next();

        Engine.playGame(gameNumber);
    }
}

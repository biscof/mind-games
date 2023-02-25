package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void getUserName() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("May I have your name? ");
        String userInput = scanner.next();
        System.out.printf("Hello, %s!\n", userInput);
    }
}

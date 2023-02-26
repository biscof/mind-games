package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String greetUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.printf("Hello, %s!\n", userName);

        return userName;
    }
}

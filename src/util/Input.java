package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        int userInput;
        do {
            System.out.printf("Enter a number between %d and %d%n", min, max);
            userInput = scanner.nextInt();
        } while (userInput > max || userInput < min);
        return userInput;
    }

    public int getInt() {
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double userInput;
        do {
            System.out.printf("Enter a number between %f and %f", min, max);
            userInput = scanner.nextDouble();
        } while (userInput > max && userInput < min);
        return userInput;
    }

    public double getDouble() {
        return scanner.nextDouble();
    }

}

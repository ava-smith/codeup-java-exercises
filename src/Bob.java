import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {
        String userInput;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Tell Bob something");
            String userResponse = scanner.nextLine();
            if (userResponse.trim().endsWith("?")) {
                System.out.println("Sure.");
            } else if (userResponse.trim().endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userResponse.equals("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }
            System.out.println("Do you want to continue [y/n]");
            userInput = scanner.nextLine();
        } while (userInput.equals("y"));
    }
}

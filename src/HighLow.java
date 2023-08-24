import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        guessTheNumber();
    }


    public static void guessTheNumber() {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int randomNum = rand.nextInt(100) + 1;
        System.out.println("Guess the number from 1 to 100: ");
        int userNum;
        do {
            userNum = scan.nextInt();
            if (userNum == randomNum) {
                System.out.println("GOOD GUESS!");
            } else if (userNum < randomNum) {
                System.out.println("HIGHER");
            } else {
                System.out.println("LOWER");
            }
        } while (userNum != randomNum);
    }
}

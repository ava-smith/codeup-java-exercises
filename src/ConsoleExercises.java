import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
// question 1 =============
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f. %n", pi);
// question 2 =============
//        System.out.println("Enter an integer: ");
//        int userInteger = inputScanner.nextInt();
//        System.out.println(userInteger);
// question 3 =============
//        System.out.println("Enter 3 words, seperated by spaces: ");
//        String wordOne = inputScanner.next();
//        String wordTwo = inputScanner.next();
//        String wordThree = inputScanner.next();
//        System.out.printf("%s%n%s%n%s%n", wordOne, wordTwo, wordThree);
// question 4 =============
//        System.out.println("Enter a sentence: ");
//        String userSentence = inputScanner.nextLine();
//        System.out.printf("%s", userSentence);
// question 5 =============
        System.out.println("Enter the length of the classroom in feet: ");
        String userLength = inputScanner.nextLine();
        System.out.println("Enter the width of the classroom in feet: ");
        String userWidth = inputScanner.nextLine();
        int userLengthInt = Integer.parseInt(userLength);
        int userWidthInt = Integer.parseInt(userWidth);
        int perimeter = (userLengthInt *2) + (userWidthInt * 2);
        int area = (userLengthInt * userWidthInt);
        System.out.printf("The perimeter of the classroom is: %d ft%n", perimeter);
        System.out.printf("The area of the classroom is: %d sq ft", area);
    }
}

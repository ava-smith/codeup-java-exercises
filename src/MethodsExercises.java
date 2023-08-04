import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {
    //    public static void main(String[] args) {
//        System.out.println(addition(6, 9));
//        System.out.println(addition(3.4, 3.8));
//        System.out.println(subtraction(9, 3));
//        System.out.println(subtraction(9.2, 5));
//        System.out.println(multiplication(10, 2));
//        System.out.println(multiplication(10.3, 6.2));
//        System.out.println(division(10, 2));
//        System.out.println(division(10.2, 5.2));
//        System.out.println(modulus(10, 2));
//    }
//1.) basic arithmetic ======================
    public static int addition(int int1, int int2) {
        return int1 + int2;
    }

    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    public static int subtraction(int int1, int int2) {
        return int1 - int2;
    }

    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public static int multiplication(int int1, int int2) {
        return int1 * int2;
    }

    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public static int division(int int1, int int2) {
        return int1 / int2;
    }

    public static double division(double num1, double num2) {
        return num1 / num2;
    }

    public static int modulus(int int1, int int2) {
        return int1 % int2;
    }
//2.) method that validates if a user number is within a certain range ============
//    public static void main(String[] args) {
//        System.out.println("Your number is: " + getInteger(1, 10));
//    }
    public static int getInteger(int min, int max) {
        Scanner scan = new Scanner(System.in);
        int input;
        do {
            System.out.println("Please enter an integer between " + min + " and " + max + ".");
            input = scan.nextInt();

        } while(!isInRange(input, min, max));
        return input;
    }

    public static boolean isInRange(int num, int min, int max) {
        return num <= max && num >= min;
    }
//3.) calculate the factorial of a number ======================
//    public static void main(String[] args) {
//        int factorial = getInteger(1, 10);
//        boolean quit = false;
//
//        while(!quit) {
//            System.out.println("The factorial of " + factorial + " is " + getFactorial(factorial));
//            System.out.println("Continue? [y/n]");
//            quit = quit();
//        }
//    }

    private static boolean quit() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        return Character.toLowerCase(input.charAt(0)) != 'y';
    }
    public static long getFactorial(long factorial) {
        long result = 1;
        for (int i = 1; i <= factorial; i++) {
            result *= i;
        }
        return result;
    }

// 4.) simulate dice rolling
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean quit = false;
        System.out.println("Enter the number of sides for a pair of dice: ");
        int numOfSides = scan.nextInt();
        System.out.println("Would you like to roll the dice? [y/n]");
        String rollOrNo = scan.next();
        int randomRoll1 = 0;
        int randomRoll2 = 0;
        if (rollOrNo.equalsIgnoreCase("y")) {
            Random rand = new Random();
            randomRoll1 = rand.nextInt(numOfSides);
            randomRoll2 = rand.nextInt(numOfSides);
        }
        while(!quit) {
            System.out.println("First dice roll: " + randomRoll1);
            System.out.println("Second dice roll: " + randomRoll2);
            System.out.println("Continue? [y/n]");
            quit = quit();
        }
    }
}





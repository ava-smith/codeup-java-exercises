import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// question 1a ==============
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }
// question 1b ==============
//        int i = 0;
//        do {
//            if(i % 2 == 0) {
//                System.out.println(i);
//            }
//            i++;
//        } while (i <= 100);

//        int i = 0;
//        do {
//            if(i % 5 == 0) {
//                System.out.println(i);
//            }
//            i--;
//        } while (i >= -10);

//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 1_000_000);
// question 1c ==============
//        for (int i = 0; i <= 100; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }

//        for (int i = 100; i >= -10; i--) {
//            if (i % 5 == 0) {
//                System.out.println(i);
//            }
//        }

//        for (long i = 2; i < 1_000_000; i *=i) {
//            System.out.println(i);
//        }
// question 2 ===============
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            }
//            if (i % 3 == 0){
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }
// question 3 ===============
//        System.out.println("What number would you like to go up to?: ");
//        int userInt = Integer.parseInt(scanner.nextLine());
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//        for (int i = 1; i <= userInt; i++){
//            int intSquared = i * i;
//            int intCubed = i * i * i;
//            System.out.printf("%-6d | %-7d | %-4d%n", i, intSquared, intCubed);
//        }
//        System.out.println("Would you like to continue? [y/n]");
//        String userResponse = scanner.nextLine().toLowerCase();
//        if (userResponse.equals("y")) {
//            System.out.println("What number would you like to go up to?: ");
//            int usersInt = Integer.parseInt(scanner.nextLine());
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for (int i = 1; i <= usersInt; i++){
//                int intSquared = i * i;
//                int intCubed = i * i * i;
//                System.out.printf("%-6d | %-7d | %-4d%n", i, intSquared, intCubed);
//            }
//        }
// question 4 ================
        String userConfirmation = "y";
        while (userConfirmation.equalsIgnoreCase("y")) {
            System.out.println("Enter your grade from 0 to 100");
            int userGrade = scanner.nextInt();
            if (userGrade >= 88) {
                System.out.println("A");
            } else if (userGrade >= 80) {
                System.out.println("B");
            } else if (userGrade >= 67) {
                System.out.println("C");
            } else if (userGrade >= 60) {
                System.out.println("D");
            } else if (userGrade >= 0) {
                System.out.println("F");
            }
        }
        System.out.println("Would you like to continue? [y/n]");
        userConfirmation = scanner.next();
        System.out.println();
    }
}

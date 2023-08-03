public class MethodsExercises {

    public static void main(String[] args) {
        System.out.println(addition(6, 9));
        System.out.println(addition(3.4, 3.8));
        System.out.println(subtraction(9, 3));
        System.out.println(subtraction(9.2, 5));
        System.out.println(multiplication(10, 2));
        System.out.println(multiplication(10.3, 6.2));
        System.out.println(division(10, 2));
        System.out.println(division(10.2, 5.2));
        System.out.println(modulus(10, 2));
    }

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
}

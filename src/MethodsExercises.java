public class MethodsExercises {

    public static void main(String[] args) {
        System.out.println(addition(6, 9));
        System.out.println(subtraction(9, 3));
        System.out.println(multiplication(10, 2));
        System.out.println(division(10, 2));
        System.out.println(modulus(10, 2));
    }

    public static int addition(int int1, int int2) {
        return int1 + int2;
    }

    public static int subtraction(int int1, int int2) {
        return int1 - int2;
    }

    public static int multiplication(int int1, int int2) {
        return int1 * int2;
    }

    public static int division(int int1, int int2) {
        return int1 / int2;
    }

    public static int modulus(int int1, int int2) {
        return int1 % int2;
    }
}

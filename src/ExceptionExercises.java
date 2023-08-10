public class ExceptionExercises {
    public static void main(String[] args) {
//        System.out.println(divideNums(1, 0));
//        System.out.println(divideNums(10, 5));
        delayedHello(3);
    }

    public static int divideNums(int num1, int num2) {
        try{
            return num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0");
            return 0;
        }
    }

    public static void delayedHello(int delay) {
        try {
            Thread.sleep(delay * 1000L);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted!");
        }
        System.out.println("Hello!");
    }
}

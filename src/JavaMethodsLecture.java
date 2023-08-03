public class JavaMethodsLecture {

    /*
        METHOD STRUCTURE...

        VISIBILITY_MODIFIER STATIC_OR_INSTANCE RETURN_TYPE METHOD_NAME(PARAM_DATATYPE PARAM, ...) {

            BODY OF METHOD HERE

        }

        For Example...

        public static void main(String[] args) {
            System.out.println("Hello World");
        }


     */

    // ----------- DEFINING AND CALLING METHODS WITH VARIOUS INPUTS (examples)

    // no input or returned output

//    public static void sayGreeting() {
//        System.out.println("Hello");
//    }

//    public static void main(String[] args) {
//        System.out.println(returnName());
//        System.out.println(returnLongerString("Hello", "Hi"));
//        System.out.println(canBeHalved(9));
//    }
    // no returned output with input

//    public static void sayInput(String input) {
//        System.out.println(input);
//    }

    // returned output without input

//    public static int returnSeven() {
//        return 7;
//    }

    // return output given an input

//    public static int returnInt(int someInt) {
//        return someInt;
//    }

    // multiple parameters

//    public static double returnProductOfThreeNums(double num1, double num2, double num3) {
//        return num1 * num2 * num3;
//    }


    // using a method inside another method

//    public static int returnSumOfInts(int intOne, int intTwo) {
//        return returnInt(intOne) + returnInt(intTwo);
//    }


    // return type different from input type

//    public static int returnLengthOfString(String input) {
//        return input.length();
//    }

    // multiple input types

//    public static String repeatStr(String str, int times) {
//        return str.repeat(times);
//    }

//    public static void printCharMultipleTimes(char c, int repetitions) {
//        System.out.println(String.valueOf(c).repeat(repetitions));
//    }


    /**
     * METHOD MINI-EXERCISES
     */

    // TODO: Write a method, returnName, that returns the string of your name.
//    public static String returnName() {
//        return "Ava Smith";
//    }
    // TODO: Write a method, returnLongerString, that takes in two strings and returns the longer of the two strings.
//    public static String returnLongerString(String str1, String str2) {
//        int str1Length = str1.length();
//        int str2Length = str2.length();
////        if (str1Length > str2Length) {
////            return str1;
////        } else {
////            return str2;
////        }
//        return (str1Length > str2Length) ? str1 : str2;
//    }
    // TODO: Write a method, canBeHalved, that takes in an integer and returns true if the input integer is evenly divisible by two.
//    public static boolean canBeHalved (int userInteger) {
//        return userInteger % 2 == 0;
//    }
    // TODO: !! Complete math exercises from the curriculum !!


    // ----------- OVERLOADING

    /*

        Method overloading is a way to define the same method with different method signatures.
        It is a convenience to prevent the programmer from having to create many more method names
        when defining functionality for various data type inputs.

        Much of the Java language is defined using overloaded methods (e.g. println())

     */

    // overloading example

//    public static void sayHello() {
//        System.out.println("Hello World");
//    }
//
//    public static void sayHello(int num) {
//        for (int i = 0; i < num; i += 1) {
//            sayHello();
//        }
//    }

    // Is this overloading???

//        public static String sayHello(int num) {
//            return "Hello World";
//        }

    // Is this overloading???

//        public static String sayHello(String punctuation) {
//            return "Hello World" + punctuation;
//        }



    /**
     * OVERLOAD MINI-EXERCISES
     */

    // TODO: create a method, sayName, that can take in a single name String input or two name String inputs and will return
    //  a greeting message to the user by either their first or first and last name.
    public static String sayName(String name) {
        return "Hello, " + name;
    }

    public static String sayName(String name1, String name2) {
        return "Hello, " + name1 + " " + name2;
    }

    public static void main(String[] args) {
        System.out.println(sayName("Ava", "Smith"));
    }
    // example: sayName("Justin") - "Hi Justin"
    // example: sayName("Justin", "Reich") - "Hi Justin Reich"


    // TODO: overload the math exercises from the curriculum exercise to work with both integers and doubles



}

public class ArraysExercises {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
//        System.out.println(Arrays.toString(numbers));
        // it only tells you the location of that array not the actual values. Use .toString to print the actual values.

        Person[] persons = new Person[3];

        persons[0] = new Person("Ava");
        persons[1] = new Person("Enrique");
        persons[2] = new Person("Claire");

        for(Person person : persons) {
            System.out.println(person.getName());
        }
    }


}

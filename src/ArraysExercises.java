import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
//        System.out.println(Arrays.toString(numbers));
        // it only tells you the location of that array not the actual values. Use .toString to print the actual values.

        Person[] persons = {
                new Person("Ava"),
                new Person("Enrique"),
                new Person("Claire")
        };

//        for(Person person : persons) {
//            System.out.println(person.getName());
//        }

        persons = addPerson(persons, new Person("Carrie"));
        for(Person person : persons) {
            System.out.println(person.getName());
        }
    }

    public static Person[] addPerson(Person[] persons, Person newPerson) {
        Person[] newPersonArray = Arrays.copyOf(persons, persons.length +1);
        newPersonArray[newPersonArray.length -1] = newPerson;
        return newPersonArray;
    }


}

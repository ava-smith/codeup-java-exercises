package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        students.put("sammy-sam", new Student("sam"));
        Student sam = students.get("sammy-sam");
        sam.addGrade(100);
        sam.addGrade(55);
        sam.addGrade(85);

        students.put("spam-pam", new Student("pam"));
        Student pam = students.get("spam-pam");
        pam.addGrade(94);
        pam.addGrade(78);
        pam.addGrade(93);

        students.put("angry-ram", new Student("ram"));
        Student ram = students.get("angry-ram");
        ram.addGrade(45);
        ram.addGrade(78);
        ram.addGrade(56);

        students.put("too-much-tammy", new Student("tammy"));
        Student tammy = students.get("too-much-tammy");
        tammy.addGrade(89);
        tammy.addGrade(67);
        tammy.addGrade(96);

        Input input = new Input();
        boolean running = true;
        while(running) {
            System.out.println("Welcome!");
            System.out.println("Here are the GitHub usernames of our students:");

            for (String username : students.keySet()) {
                System.out.printf("|%s| ", username);
            }
            System.out.println("\nWhat student would you like to see more information on? (or enter \"exit\" to stop)");
            String userInput = input.getString();

            if(userInput.equalsIgnoreCase("exit")) {
                running = false;
            } else {
                Student student = students.get(userInput);
                if(student == null) {
                    System.out.println("No student found. Please enter a valid username");
                } else {
                    System.out.printf("Student Name: %s%n", student.getName());
                    System.out.printf("Grades %s%n", student.grades);
                    System.out.printf("Grade Average %f%n", student.getGradeAverage());
                }
            }
        }
    }
}

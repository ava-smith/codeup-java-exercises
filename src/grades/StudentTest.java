package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Ava");
        student1.addGrade(90);
        student1.addGrade(56);
        student1.addGrade(89);
        student1.addGrade(100);

        System.out.println(student1.getGradeAverage());

    }
}

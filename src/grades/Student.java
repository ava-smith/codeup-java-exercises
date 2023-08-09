package grades;

import java.util.ArrayList;

public class Student {

    // instance variables
    private String name;
    private ArrayList<Integer> grades;

    // getters
    public ArrayList<Integer> getGrades() {
        return grades;
    }
    public String getName() {
        return this.name;
    }

    // setters
    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        int sum = 0;
        for (int grade : this.grades){
            sum += grade;
        }
        return (double) sum / this.grades.size();
    }


}

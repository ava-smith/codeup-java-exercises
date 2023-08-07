package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();
        double radius = input.getDouble("Enter the decimal number or the radius of a circle.");
        Circle myCircle = new Circle(radius);

        System.out.printf("The area your circle  %.2f,  circumference is %.2f.%n", myCircle.getArea(), myCircle.getCircumference());
    }
}

package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    // constructors
    public Rectangle(double length, double width) {
        super(length, width);
    }

    // getters
    @Override
    public double getPerimeter() {
        return 2 * this.length + 2 * this.width;
    }
    @Override
    public double getArea() {
        return this.length * this.width;
    }

    // setters
    @Override
    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public void setWidth(double width) {
        this.width = width;
    }
}

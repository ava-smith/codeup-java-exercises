package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
    protected double length;
    protected double width;

    // getters
    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }

    // setters
    public abstract void setLength(double length);
    public abstract void setWidth(double width);

    // constructors
    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }
}

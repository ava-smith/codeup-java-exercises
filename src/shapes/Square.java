package shapes;

public class Square extends Quadrilateral{
    protected double side;

    // constructors
    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    // setters
    @Override
    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }
    @Override
    public void setWidth(double side) {
        this.length = side;
        this.width = side;
    }

    // getters
    @Override
    public double getPerimeter() {
        return 4 * side;
    }
    @Override
    public double getArea() {
        return (Math.pow(this.side, 2));
    }
}

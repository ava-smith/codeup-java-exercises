package shapes;

public class Square extends Quadrilateral{
    protected int side;
    public Square(int side) {
        super(side, side);
        this.side = side;
    }
    @Override
    public void setLength(int side) {
        this.side = side;
    }

    @Override
    public void setWidth(int side) {
        this.side = side;
    }

    @Override
    public int getPerimeter() {
        return 4 * side;
    }

    @Override
    public int getArea() {
        return (int) (Math.pow(this.side, 2));
    }
}

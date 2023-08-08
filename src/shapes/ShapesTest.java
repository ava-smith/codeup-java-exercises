package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;
        Square square = new Square(5);
        myShape = square;
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        Rectangle rectangle= new Rectangle(5, 4);
        myShape = rectangle;
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
    }
}

package shapes;

public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }

    // Overriding methods from "Rectangle" class.
    public double getArea() {
        return Math.pow(super.length, 2);
    }

    public double getPerimeter() {
        return 4 * super.length;
    }
}

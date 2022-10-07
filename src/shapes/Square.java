package shapes;

public class Square extends Quadrilateral {


    public Square(double side) {
        super(side, side);
    }

    public double getArea() {
        return Math.pow(length, 2);
    }

    public double getPerimeter() {
        return 4 * length;
    }

    public void setLength(double length) {
        super.length = length;
        super.width = length;
    }

    public void setWidth(double width) {
        super.width = width;
        super.length = width;
    }
}

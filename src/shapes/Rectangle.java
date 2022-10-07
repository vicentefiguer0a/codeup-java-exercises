package shapes;

public class Rectangle extends Quadrilateral implements Measurable {


    public Rectangle(double length, double width) {
        super(length, width);
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    public void setLength(double length) {
        super.length = length;
    }

    public void setWidth(double width) {
        super.width = width;
    }
}

package shapes;

public class Rectangle {

    protected double length;
    protected double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Create two methods on the Rectangle class, getArea and getPerimeter
    // that return the respective values. The formulas for both follow:
    // - area = length x width
    // - perimeter = 2 x length + 2 x width
    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }
}

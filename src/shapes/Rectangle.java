package shapes;

public class Rectangle {

    protected int length;
    protected int width;

    // Constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Create two methods on the Rectangle class, getArea and getPerimeter
    // that return the respective values. The formulas for both follow:
    // - area = length x width
    // - perimeter = 2 x length + 2 x width
    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }
}

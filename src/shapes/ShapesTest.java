package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        System.out.println("Area: " + box1.getArea());
        System.out.println("Perimeter: " + box1.getPerimeter());

        Square box2 = new Square(5);
        System.out.println("Area: " + box2.getArea());
        System.out.println("Perimeter: " + box2.getPerimeter());

        Measurable myShape = new Square(5);

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

    }
}

// Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?
// - Because the getPerimeter method is in the "Measurable" instance
//   which is implemented by the Rectangle class.
// What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
// - You get an error saying the methods cannot be resolved. This is because
//   you have to create a new instance of whatever object has access to those specific methods.

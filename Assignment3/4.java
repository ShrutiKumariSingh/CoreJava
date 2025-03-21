// Abstract class Shape
abstract class Shape {
    String color;

    // Constructor to initialize color
    public Shape(String color) {
        this.color = color;
    }

    // Abstract method to calculate area
    public abstract double calculateArea();

    // Abstract method to draw the shape
    public abstract void draw();
}

// Subclass Circle (inherits from Shape)
class Circle extends Shape {
    double radius;

    // Constructor for Circle class
    public Circle(String color, double radius) {
        super(color); // Calling the parent class constructor
        this.radius = radius;
    }

    // Overriding method to calculate area of the circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; // Area = π * r²
    }

    // Overriding method to draw the circle
    @Override
    public void draw() {
        System.out.println("Drawing a Circle with color " + color);
    }
}

// Subclass Rectangle (inherits from Shape)
class Rectangle extends Shape {
    double length;
    double breadth;

    // Constructor for Rectangle class
    public Rectangle(String color, double length, double breadth) {
        super(color); // Calling the parent class constructor
        this.length = length;
        this.breadth = breadth;
    }

    // Overriding method to calculate area of the rectangle
    @Override
    public double calculateArea() {
        return length * breadth; // Area = length * breadth
    }

    // Overriding method to draw the rectangle
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle with color " + color);
    }
}

// Main class to test the Shapes
public class GraphicsApplication {
    public static void main(String[] args) {
        // Creating a Circle object
        Shape circle = new Circle("Red", 5.0);
        // Display circle area and draw it
        System.out.println("Area of Circle: " + circle.calculateArea());
        circle.draw();
        
        System.out.println(); // Empty line to separate output
        
        // Creating a Rectangle object
        Shape rectangle = new Rectangle("Blue", 4.0, 6.0);
        // Display rectangle area and draw it
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        rectangle.draw();
    }
}

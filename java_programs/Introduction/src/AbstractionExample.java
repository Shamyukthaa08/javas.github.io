public class Shape {

    
    public abstract double area();
    public abstract double perimeter();
    public abstract void draw();
    public abstract String getDescription();
}

// Concrete subclass
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public String getDescription() {
        return "This is a circle with radius " + radius;
    }
}

// Concrete subclass
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    public String getDescription() {
        return "This is a rectangle with length " + length + " and width " + width;
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        // Creating instances of concrete subclasses
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        // Calling abstract methods on concrete objects
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());
        circle.draw();
        System.out.println(circle.getDescription());

        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
        rectangle.draw();
        System.out.println(rectangle.getDescription());
    }
}

    


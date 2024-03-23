abstract class Shape {
    public abstract double calculateArea();
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

class Circle extends Shape {
    private double radious;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// So, I defined an abstract Shape class with an abstract method calculateArea(). Concrete subclasses
// like Rectangle and Circle extend the Shape class and provide their own implementation for calculating the area.
// This design allows to introduce new shapes by creating additional subclasses without modifying existing code,
// thereby adhering to the Open-Closed Principle.
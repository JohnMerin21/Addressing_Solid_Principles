class Shape {
    public double calculateArea() {
        return 0;
    }
}

// for xample Rectangle.java
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return * height;
    }
}

// The shape class contains a method 'calculateArea() which calculates the area of various shapes. However,
// when a new shape, like Rectangle, needs to be added, instead of extending the shape class to accomodate
// the new shape, I modified the Shape class to include the functionality for calculation the area of a rectangle.
// which violates the OCP.
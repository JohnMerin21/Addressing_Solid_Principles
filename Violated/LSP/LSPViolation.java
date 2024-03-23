class Rectangle {
    protected int width;
    protected int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth () {
        return width;
    }

    public void setWidth (int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }
    public int setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }

    // Violates LSP: modifying the width or height of a Square affects bothdimensions,
    // which in turns leads to unexpected behavior.

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }
    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }
}
// This demonstrates a violation of the Liskov Substition Principle (LSP) by having a
// "Square" class inherit from a 'Rectangle' class. Modifying the width or heigth of a 'Square'
// object leads to unexpected behavior, as it affects both dimensions, violating the principle.
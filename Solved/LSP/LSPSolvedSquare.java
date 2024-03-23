class Square implements Shape {
    protected int side;
    public Square(int side) {
        this.side = side;
    }
    public int getSide() {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}
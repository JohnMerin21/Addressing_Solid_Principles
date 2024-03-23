interface Shape {
    int getArea();
}

class Rectangle implements Shape {
    protected int width;
    protected int height;
}

public int getWidth() {
    return width;
}
public void setWidth(int width) {
    this.width = width;
}

public int getHeight() {
    return height;
}

public void setHeight(int height) {
    this.height = height;
}

@Override
public int getArea() {
    return width * height;
    }
}


// I corrected the violation of the LSP by removing the inheritance relationship between 'Square'
// & 'Rectangle'. Instead, both classes implemented the 'Shape' interface independently, and each class
// provides its own implementation for calculating the area. This approach ensures that each class can be
// substituted for another without altering the correctness of the program, adhering to the LSP.
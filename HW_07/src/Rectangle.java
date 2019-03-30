public class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle() {
    }

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle " +
                "width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                "class='" + getClass() + '\'';
    }

    @Override
    public double calcArea() {
        return width*height;
    }
}

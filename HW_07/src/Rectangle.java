public class Rectangle extends Shape {
    private int width;
    private int height;

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
                ", color='" + getColor() + '\'' +
                "class='" + getClass() + '\'';
    }

    @Override
    public double calcArea() {
        return width * height;
    }
}

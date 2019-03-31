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
    public double calcArea() {
        if (width > 0 && height > 0) {
            return width * height;
        } else {
            System.err.println("Incorrect data");
            return DEFAULT_AREA;
        }
    }

    @Override
    public String toString() {
        return "Rectangle " +
                "width=" + width +
                ", height=" + height +
                ", color='" + getColor() + '\'' +
                "class='" + getClass() + '\'';
    }
}

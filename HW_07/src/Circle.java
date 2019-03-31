public class Circle extends Shape {
    private int radius;

    public Circle() {
    }

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle " +
                "radius=" + radius +
                ", color='" + getColor() + '\'' +
                "class='" + getClass() + '\'';
    }

    @Override
    public double calcArea() {
        if (radius > 0) {
            return Math.PI * (radius * radius);
        } else {
            System.err.println("Incorrect data");
            return DEFAULT_AREA;
        }
    }
}

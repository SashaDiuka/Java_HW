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
                ", color='" + color + '\'' +
                "class='" + getClass() + '\'';
    }

    @Override
    public double calcArea() {
        return Math.PI * (radius * radius);
    }
}

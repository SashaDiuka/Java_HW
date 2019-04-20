import java.util.Objects;

public class Circle extends Shape {
    private int radius;

    public Circle() {
    }

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
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

    @Override
    public String toString() {
        return "Circle " +
                "radius=" + radius +
                ", color='" + getColor() + '\'' +
                "class='" + getClass() + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }
}


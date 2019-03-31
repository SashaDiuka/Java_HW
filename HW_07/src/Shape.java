public class Shape {
    public static final double DEFAULT_AREA = 0.0;
    private String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Shape " +
                "color='" + color + '\'' +
                "class='" + getClass() + '\'';
    }

    public double calcArea() {
        return DEFAULT_AREA;
    }
}

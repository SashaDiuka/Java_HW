public class Shape {
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
        return 0.0;
    }
}

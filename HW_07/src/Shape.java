public class Shape {
    String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
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

public class Triangle extends Shape {
    private int a;
    private int b;
    private int c;

    public Triangle() {
    }

    public Triangle(String color, int a, int b, int c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcArea() {
        if (a > 0 && b > 0 && c > 0) {
            int p = (a + b + c) / 2;
            return Math.sqrt(p * ((p - a) * (p - b) * (p - c)));
        } else {
            System.err.println("Incorrect data");
            return DEFAULT_AREA;
        }
    }

    @Override
    public String toString() {
        return "Triangle " +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", color='" + getColor() + '\'' +
                "class='" + getClass() + '\'';
    }
}

public class Triangle extends Shape {
    int a;
    int b;
    int c;

    public Triangle() {
    }

    public Triangle(String color, int a, int b, int c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle " +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", color='" + color + '\'' +
                "class='" + getClass() + '\'';
    }

    @Override
    public double calcArea() {
        int p = (a + b + c)/2;
        return Math.sqrt(p*((p - a)*(p - b)*(p - c)));
    }
}

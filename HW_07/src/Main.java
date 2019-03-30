import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Shape[] figures = {
                new Rectangle("blue", 12, 4),
                new Rectangle("red", 23, 5),
                new Rectangle("grey", 37, 22),
                new Rectangle("white", 15, 55),
                new Circle("green", 23),
                new Circle("rose", 54),
                new Circle("violet", 34),
                new Triangle("white", 3, 3, 5),
                new Triangle("black", 12, 12, 12)
        };
        showFigures(figures);
        System.out.println("\n" + figuresAreaSum(figures));
        System.out.println("\n" + Arrays.toString(getDifferentAreas(figures)));
    }

    public static void showFigures(Shape[] figures) {
        for (Shape row : figures) {
            System.out.println(row.toString());
        }
    }

    public static double figuresAreaSum(Shape[] figures) {
        double sumArea = 0.0;
        for (Shape row : figures) {
            sumArea += row.calcArea();
        }
        return sumArea;
    }

    public static double[] getDifferentAreas(Shape[] figures) {
        double triangleArea = 0.0;
        double circleArea = 0.0;
        double rectangleArea = 0.0;
        for (Shape row : figures) {
            if (row instanceof Rectangle) {
                rectangleArea += row.calcArea();
            } else if (row instanceof Triangle) {
                triangleArea += row.calcArea();
            } else {
                circleArea += row.calcArea();
            }
        }
        double[] result = {rectangleArea, circleArea, triangleArea};
        return result;
    }
}

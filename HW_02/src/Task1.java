public class Task1 {

    public static void main(String[] args) {
        int y = 34, x = 78;
        print(x, y);
        x = x + y;
        y = x - y;
        x = x - y;
        print(x, y);
    }

    private static void print(int x, int y) {
        System.out.println("X = " + x + "; " + "Y = " + y);
    }
}

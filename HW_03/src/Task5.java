public class Task5 {

    public static void main(String[] args) {
        int stars = 1;
        int spaces = 4;
        printTriangle(stars, spaces);
        printTriangle(stars, spaces);
    }

    private static void printTriangle(int stars, int spaces) {
        while (stars < 10) {
            printSpace(spaces);
            printSymbol(stars);
            printSpace(spaces);
            spaces--;
            stars += 2;
            System.out.println();
        }
    }

    private static void printSymbol(int symbol) {
        while (symbol > 0) {
            System.out.print("* ");
            symbol--;
        }
    }

    private static void printSpace(int space) {
        while (space > 0) {
            System.out.print("  ");
            space--;
        }
    }
}

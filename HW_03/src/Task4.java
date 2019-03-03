public class Task4 {

    public static void main(String[] args) {
        int stars = 1;
        int spaces = 4;
        while (stars < 5) {
            printSpace(spaces);
            printSymbol(stars);
            stars++;
            spaces--;
            System.out.println();
        }
        while (stars > 0) {
            printSpace(spaces);
            printSymbol(stars);
            stars--;
            spaces++;
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

public class Task2 {

    public static void main(String[] args) {
        int stars = 5;
        int space = 0;
        while (stars > 0) {
            printSpace(space);
            printSymbol(stars);
            stars--;
            space++;
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

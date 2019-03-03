public class Task1 {

    public static void main(String[] args) {
        int stars = 1;
        while (stars < 5) {
            printSymbol(stars);
            stars++;
            System.out.println();
        }
        while (stars > 0) {
            printSymbol(stars);
            stars--;
            System.out.println();
        }
    }

    private static void printSymbol(int symbol) {
        while (symbol > 0) {
            System.out.print("* ");
            symbol--;
        }
    }
}

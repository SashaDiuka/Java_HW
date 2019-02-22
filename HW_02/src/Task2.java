public class Task2 {

    public static void main(String[] args) {
        int number = 596;
        printDifference(number, reverse(number));
    }

    private static int reverse(int number) {
        int units = number % 10;
        int dickers = (number - units) / 10 % 10;
        int hundreds = (number - (dickers * 10 + units)) / 100;
        return units * 100 + dickers * 10 + hundreds;
    }

    private static void printDifference(int numberOne, int numberTwo) {
        System.out.println(numberOne + " - " + numberTwo + " = " + (numberOne - numberTwo));
    }
}
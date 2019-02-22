import java.util.Scanner;

public class Task3 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double pounds = getInput();
        int kilo = (int) convertToKilograms(pounds);
        int grams = (int) ((convertToKilograms(pounds) - kilo) * 1000);
        System.out.println(pounds + " Pounds = " + kilo + " Kilograms " + grams + " grams");
    }

    private static double getInput() {
        System.out.println("Enter Pounds:");
        return sc.nextDouble();
    }

    private static double convertToKilograms(double pounds) {
        return pounds / 2.2046;
    }
}

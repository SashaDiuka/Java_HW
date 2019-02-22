import java.util.Scanner;

public class Task4 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Deposit:");
        double dep = getInput();
        System.out.println("Enter Months:");
        int month = (int) getInput();
        System.out.println("Enter Percent:");
        int per = (int) getInput();
        double profit = (dep / 100 * per) / 12 * month;
        System.out.println("Profit: " + profit);
    }

    private static double getInput() {
        return sc.nextDouble();
    }
}

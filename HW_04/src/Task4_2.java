import java.util.Scanner;

public class Task4_2 {

    public static void main(String[] args) {
        System.out.println(reverseString(convertToBinary(in())));
    }

    private static String reverseString(String ReverseNumber) {
        String number = "";
        for (int i = ReverseNumber.length() - 1; i >= 0; i--) {
            number += ReverseNumber.charAt(i);
        }
        return number;
    }

    private static String convertToBinary(int number) {
        String reverseNumber = "";
        for (int i = number; i >= 1; i /= 2) {
            number = i % 2;
            reverseNumber += number;
        }
        return reverseNumber;
    }

    private static int in() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}

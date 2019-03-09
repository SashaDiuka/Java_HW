import java.util.Scanner;

public class Task4_2 {

    public static void main(String[] args) {
        String reverseNumber = convertToReverseBinary(in());
        String number = convertToBinary(reverseNumber);
        System.out.println(number);
    }

    private static String convertToBinary(String ReverseNumber) {
        String number = "";
        for (int i = ReverseNumber.length() - 1; i >= 0; i--) {
            number += ReverseNumber.charAt(i);
        }
        return number;
    }

    private static String convertToReverseBinary(int number) {
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

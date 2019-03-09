import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {
        System.out.println("Please input your number:");
        String number = convertToBinary(in());
        System.out.println(number);
    }

    private static String reverseString(String s) {
        String line = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            line += s.charAt(i);
        }
        return line;
    }

    private static String convertToBinary(int number) {
        String reverseBinary = "";
        for (int i = number; i >= 1; i /= 2) {
            number = i % 2;
            reverseBinary += number;
        }
        return reverseString(reverseBinary);
    }

    private static int in() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
import java.util.Scanner;

public class Task4_1 {

    public static void main(String[] args) {
        String line = in();
        System.out.print("Your word consists of: ");
        for (int i = 0; i < findSymbols(line).length(); i++) {
            System.out.print(findSymbols(line).charAt(i) + ", ");
        }
        System.out.println("symbols");
    }

    private static String findSymbols(String in) {
        String result = "";
        for (int i = 0; i < in.length(); i++) {
            if ((in.indexOf(in.charAt(i))) == in.lastIndexOf(in.charAt(i))) {
                result += in.charAt(i);
            }
        }
        return result;
    }

    private static String in() {
        System.out.println("Enter your word");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
}

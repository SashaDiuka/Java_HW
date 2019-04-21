package Library;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilites {

    public static int inputInt() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static String inputString() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}

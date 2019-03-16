import java.util.Arrays;
import java.util.Scanner;

public class Task5_2 {

    public static void main(String[] args) {
        System.out.println("Enter array size");
        int size = input();
        int[] array = createArray(size);
        System.out.println("Array consists of:" + Arrays.toString(array));
        getSummaryOddElementes(array);
    }

    static int[] createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    static int input() {
        Scanner sc = new Scanner(System.in);
        int size;
        do {
            size = sc.nextInt();
            if (size < 2) {
                System.out.println("Enter correct size");
            }
        }
        while (size < 2);
        return size;
    }

    static void getSummaryOddElementes(int[] array) {
        int oddNumber = 0;
        int oddSummary = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                oddNumber++;
                oddSummary += array[i];
            }
        }
        System.out.println("Array has " + oddNumber + " odd elements" + "" +
                "\nSummary of array odd elements = " + oddSummary);
    }
}

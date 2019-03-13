import java.util.Arrays;
import java.util.Scanner;

public class Task5_2 {

    public static void main(String[] args) {
        System.out.println("Enter array size");
        int size = input();
        int[] array = createArray(size);
        System.out.println("Array consists of:" + Arrays.toString(array));
        calcOdd(array);
    }

    static int[] createArray(int size) {
        int[] array = new int[size];
        for (int counter = 0; counter < array.length; counter++) {
            array[counter] = (int) (Math.random() * 100);
        }
        return array;
    }

    static int input() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        if (size < 2) {
            System.out.println("Incorrect array size");
            System.exit(0);
        }
        return size;
    }

    static void calcOdd(int[] array) {
        int oddNumber = 0;
        int oddSum = 0;
        for (int counter = 0; counter < array.length; counter++) {
            if ((array[counter]) % 2 != 0) {
                oddNumber++;
                oddSum += array[counter];
            }
        }
        System.out.println("Array has " + oddNumber + " odd elements" + "" +
                "\nSummary of array odd elements = " + oddSum);
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Task5_4 {

    public static void main(String[] args) {
        System.out.println("Enter array size");
        int size = input();
        int[] array = createArray(size);
        int[] arrayPositive = getPositiveElements(array);
        int[] arrayNegative = getNegativeElements(array);
        System.out.println("Array consists of: " + Arrays.toString(array));
        System.out.println("Array  of positive values consists of: " + Arrays.toString(arrayPositive));
        System.out.println("Array  of negative values consists of: " + Arrays.toString(arrayNegative));
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

    static int[] createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 20) - 10);
        }
        return array;
    }

    static int[] getPositiveElements(int[] array) {
        int positiveArrayLength = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                positiveArrayLength++;
            }
        }
        int[] positiveArray = new int[positiveArrayLength];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                positiveArray[counter] = array[i];
                counter++;
            }
        }
        return positiveArray;
    }

    static int[] getNegativeElements(int[] array) {
        int negativeArrayLength = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negativeArrayLength++;
            }
        }
        int[] negativeArray = new int[negativeArrayLength];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negativeArray[counter] = array[i];
                counter++;
            }
        }
        return negativeArray;
    }
}



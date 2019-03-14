import java.util.Arrays;
import java.util.Scanner;

public class Task5_4 {

    public static void main(String[] args) {
        System.out.println("Enter array size");
        int size = input();
        int[] array = createArray(size);
        int[] arrayPositive = findArrayPositive(array);
        int[] arrayNegative = findArrayNegative(array);
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

    static int[] findArrayPositive(int[] array) {
        int positiveArrayLenth = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                positiveArrayLenth++;
            }
        }
        int[] arrayPositive = new int[positiveArrayLenth];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                arrayPositive[counter] = array[i];
                counter++;
            }
        }
        return arrayPositive;
    }

    static int[] findArrayNegative(int[] array) {
        int negativeArrayLenth = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negativeArrayLenth++;
            }
        }
        int[] arrayNegative = new int[negativeArrayLenth];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                arrayNegative[counter] = array[i];
                counter++;
            }
        }
        return arrayNegative;
    }
}



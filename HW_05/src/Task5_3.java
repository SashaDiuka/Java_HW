import java.util.Arrays;
import java.util.Scanner;

public class Task5_3 {
    public static void main(String[] args) {
        System.out.println("Enter arrays size");
        int size = input();
        int[] arr1 = createArray(size);
        int[] arr2 = createArray(size);
        int[] arrSum = arraysSum(arr1, arr2);
        System.out.println("Array1 consists of:" + Arrays.toString(arr1));
        System.out.println("Array2 consists of:" + Arrays.toString(arr2));
        System.out.println("Summary array of arrays 1 and 2 consists of:" + Arrays.toString(arrSum));
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

    static int[] arraysSum(int[] arr1, int[] arr2) {
        int[] arraySum = new int[arr1.length];
        for (int counter = 0; counter < arraySum.length; counter++) {
            arraySum[counter] = arr1[counter] + arr2[counter];
        }
        return arraySum;
    }
}

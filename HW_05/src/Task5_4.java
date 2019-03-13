import java.util.Arrays;
import java.util.Scanner;

public class Task5_4 {

    public static void main(String[] args) {
        System.out.println("Enter array size");
        int size = input();
        int[] array = createArray(size);
        int[] arrOdd = findArrOdd(array);
        int[] arrEven = findArrEven(array);
        System.out.println("Array consists of: " + Arrays.toString(array));
        System.out.println("Array  odd consists of: " + Arrays.toString(arrOdd));
        System.out.println("Array  even consists of: " + Arrays.toString(arrEven));
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
        for (int counter = 0; counter < array.length; counter++) {
            array[counter] = (int) (Math.random() * 100);
        }
        return array;
    }

    static int[] findArrOdd(int[] array) {
        int oddArrLenth = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddArrLenth++;
            }
        }
        int[] arrOdd = new int[oddArrLenth];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                arrOdd[j] = array[i];
                j++;
            }
        }
        return arrOdd;
    }

    static int[] findArrEven(int[] array) {
        int evenArrLenth = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenArrLenth++;
            }
        }
        int[] arrEven = new int[evenArrLenth];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrEven[j] = array[i];
                j++;
            }
        }
        return arrEven;
    }
}



import java.util.Arrays;
import java.util.Scanner;

public class Task5_1 {

    public static void main(String[] args) {
        System.out.println("Enter array size");
        int size = input();
        int[] array = createArray(size);
        int[] arrayReverse = reverseArray(array);
        System.out.println("Your array is: " + Arrays.toString(array));
        System.out.println("Reverse of your array is: " + Arrays.toString(arrayReverse));
    }

    static int[] createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    static int[] reverseArray(int[] array) {
        int[] arrayReverse = new int[array.length];
        int counter = 0;
        for (int i = (array.length - 1); i >= 0; i--) {
            arrayReverse[counter] = array[i];
            counter++;
        }
        return arrayReverse;
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
}

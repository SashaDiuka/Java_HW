import java.util.Arrays;
import java.util.Scanner;

public class Task5_3 {
    public static void main(String[] args) {
        System.out.println("Enter arrays size");
        int size = input();
        int[] arrayOne = createArray(size);
        int[] arrayTwo = createArray(size);
        int[] arraysSummary = arraysSummary(arrayOne, arrayTwo);
        System.out.println("Array one  consists of:" + Arrays.toString(arrayOne));
        System.out.println("Array two consists of:" + Arrays.toString(arrayTwo));
        System.out.println("Summary array of arrays one and two consists of:" + Arrays.toString(arraysSummary));
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

    static int[] arraysSummary(int[] arrayOne, int[] arrayTwo) {
        int[] arraysSummary = new int[arrayOne.length];
        for (int i = 0; i < arraysSummary.length; i++) {
            arraysSummary[i] = arrayOne[i] + arrayTwo[i];
        }
        return arraysSummary;
    }
}

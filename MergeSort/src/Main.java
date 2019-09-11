import java.util.Random;
/**
 * Created by Johan Engström 2019-09-11
 *
 * Mergesort with code from coarse material of ID1020
 */

public class Main {
    public static void main(String[] args) {

        Comparable[] intArray = generateIntArray(50);
        Comparable[] floatArray = generateFloatArray(50);
        Comparable[] charArray = generateCharArray(50);

        run(intArray);
        runTimed(floatArray);
    }

    public static void run(Comparable[] array) {
        print(array);
        isSorted(array);
        MergeSort.sort(array);
        print(array);
        isSorted(array);
        System.out.println("-----------------------------------------------------------");
    }

    public static void runTimed(Comparable[] array) {
        print(array);
        isSorted(array);
        long startTime = System.nanoTime();
        MergeSort.sort(array);
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        print(array);
        isSorted(array);
        System.out.println((timeElapsed) + " ns");
        System.out.println("-----------------------------------------------------------");
    }

    public static Comparable[] generateFloatArray(int size) {
        Comparable[] array = new Comparable[size];
        for (int i = 0; i < array.length; i++) { // fill the array of chars
            array[i] = (float) Math.random(); // random char from a to z
        }
        return array;
    }

    public static Comparable[] generateIntArray(int size) {
        Comparable[] array = new Comparable[size];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) { // fill the array of ints
            array[i] = rand.nextInt(size); // random int from 0 to size
        }
        return array;
    }

    public static Comparable[] generateCharArray(int size) {
        Comparable[] array = new Comparable[size];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) { // fill the array of chars
            array[i] = (char) (rand.nextInt(26) + 'a'); // random char from a to z
        }
        return array;
    }

    public static void isSorted(Comparable[] array) {
        System.out.println(MergeSort.isSorted(array));
    }

    public static void print(Comparable[] array) {
        for (Comparable i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
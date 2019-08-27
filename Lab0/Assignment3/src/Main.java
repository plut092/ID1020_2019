/*
Created by Johan Engström 2019-08-27
A program to read in a int from stdin to decide a array size.
Read the following numbers into the array and then sending the array in reverse order to stdout.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // setup for stdin
        Scanner stdin = new Scanner(System.in);
        // reading first int from stdin to variable that decides array size
        System.out.println("Input an integer with the size of the array\n" +
                "followed by that many integers to be reversed: ");
        int nrElements = stdin.nextInt();

        // dynamically allocated array with nrElements
        int[] arrayOfIntegers = new int[nrElements];

        // Reads nrElements integers from stdin and stores them in the array
        int count = 0;
        while (nrElements-- > 0){
            arrayOfIntegers[count++] = stdin.nextInt();
        }
        // stdout array in reverse
        for (int i = (arrayOfIntegers.length - 1); i >= 0 ; i--) {
            System.out.println(arrayOfIntegers[i]);
        }
    }
}

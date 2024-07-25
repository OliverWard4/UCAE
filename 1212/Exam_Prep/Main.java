import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] argv) {

        /*
         * for loop
         * creates a temporary vaiable set to 0
         * will run the code over and over again increasing i by one
         * once i no longer is less than 10 the loop will cease
         */
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // creates an pointer for an array of integers
        int[] arr;
        // creates a NEW array of integers of size 5, AND sets the pointer equal to it
        arr = new int[5];

        /*
         * For Each Loop
         * for every integer in the array we will do the following code
         * x is equal to the integer at a certain point in time
         */
        for (int x : arr) {
            System.out.println(x);
        }

        /*
         * Creates an ArrayList pointer of Type Integer
         * Then creates an ArrayList of type Integer and sets the Array List equal to it
         */
        ArrayList<Integer> arrList;
        arrList = new ArrayList<Integer>();

        for (int i = 0; i < arrList.size(); i++) {

            System.out.println(arrList.get(i));
        }

    }

}
package arrays;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = new int[5];
        int[] arr = { 6, 7, 8, 9, 10 };
        int[] arr3;
        arr3 = arr;

        ArrayList<Integer> arrList = new ArrayList<Integer>(); 
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(345565); 


         

/*
 * add()
 * remove()
 * size()
 * get()
 */
        for (int i = 0; i < arrList.size(); i++){
            System.out.println(arrList.get(i) );
        }

        System.out.println();

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr3[i] + " ");
        }

    }
}

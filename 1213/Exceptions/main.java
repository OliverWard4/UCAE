package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

public class main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr1 = {1,2,3}; 
        try{
            arr1[67] = 4;  
        } catch (IndexOutOfBoundsException e){
            arr1[0] = 4; 
        }















        try {
            System.out.println("Enter a number");
            int num = Integer.parseInt(in.nextLine());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



        try {
            int[] arr = { 1, 2, 3, 4, 5 };
            System.out.println("Enter an index: ");
            int index = in.nextInt();
            int out = arr[index];
            System.out.println(out);

        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Hey start putting in the right infor,mation ");
        }

    }

}

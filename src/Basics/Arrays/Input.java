package Basics.Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //array of primitives
//        int[] arr = new int[5];
//        arr[0] = 23;
//        arr[1] = 45;
//        arr[2] = 23;
//        arr[3] = 47;
//        arr[4] = 99;
//        //[23.45,..]
//        System.out.println(arr[3]);

        //input using loops
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//
//        }

        // other way

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr.length+" ");
//
//        }
       // System.out.println(Arrays.toString(arr));
        //for each loop
//        for (int num : arr) {
//            System.out.print(num+" ");


        //arrays of objects
        String[] str= new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i]=in.next();
        }
        System.out.println(Arrays.toString(str));
        }
    }

package Basics.Arrays;
import java.util.Scanner;
public class Multidimenstion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        123
        456
        789
         */
        //stored like array in the  array
//    int[][] arr ={{1,2,3},//0 th index
//            {4,5,6},//1st index
//            {7,8,9}//2 nd index


        int[][] arr = new int[3][3];
        //input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        // output
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");


            }
            System.out.println();
        }}}
package Basics.condition.Wallah;

import java.util.Scanner;
//take positive integer input and tell if it is divisible by 5 or 3 but not divisible by 15
public class NestedD5NotD3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        if (n%5==0||n%3==0){
//            if (n%15!=0){
//                System.out.println("The number is divisible by 3 or 5 but not 15");
//            }
//            else System.out.println("Not matching the required solution");
//        }
//        else System.out.println("Not matching the required solution");
        if (n%15!=0&&(n%3==0 ||n%5==0)){
            System.out.println("The number is divisible by 3 or 5 but not 15");
        }
        else System.out.println("Not matching the required solution");
    }
}

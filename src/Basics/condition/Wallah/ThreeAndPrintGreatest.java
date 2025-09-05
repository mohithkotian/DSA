package Basics.condition.Wallah;

import java.util.Scanner;

public class ThreeAndPrintGreatest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number: ");
        int a=sc.nextInt();
        System.out.println("enter the second number: ");
        int b=sc.nextInt();
        System.out.println("enter the third number: ");
        int c=sc.nextInt();
        if(a>b&&a>c){
            System.out.println("The first number a is greatest among all");
        }
        else if (b>a&&b>c){
            System.out.println("The second number b is greatest among all");
        }
        if(c>a&&c>b){
            System.out.println("The third number c is greatest among all");
        }
    }
}

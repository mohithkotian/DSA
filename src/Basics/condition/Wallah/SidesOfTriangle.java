package Basics.condition.Wallah;

import java.util.Scanner;

public class SidesOfTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter the first side a is: ");
        int b=sc.nextInt();
        System.out.println("Enter the second side b is: ");
        int c=sc.nextInt();
        System.out.println("Enter the third side c is: ");
        if(a+b>c&&b+c>a&&a+c>b){
            System.out.println("It is triangle");
        }
        else System.out.println("Not a triangle");
    }
}

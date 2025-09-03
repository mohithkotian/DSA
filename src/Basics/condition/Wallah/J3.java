package Basics.condition.Wallah;

import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //absolute value of that integer
        System.out.println("enter any integer ");
        int n =sc.nextInt();
        if(n<0){
            n*=-1;
        }
        System.out.println("the absolute is :"+n);

    }
}

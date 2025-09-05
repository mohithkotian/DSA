package Basics.condition.Wallah;

import java.util.Scanner;
public class TwoDigitNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>9&&n<100){
            System.out.println("it is a two digit number");
        }
        else{
            System.out.println("not a two digit number");
        }
    }
}

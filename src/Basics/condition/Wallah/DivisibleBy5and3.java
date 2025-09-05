package Basics.condition.Wallah;

import java.util.Scanner;

public class DivisibleBy5and3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        if(n%5==0&&n%3==0){
        if(n%15==0){
            System.out.println("It is divisible by both 5 and 3 ");
        }
        else {
            System.out.println("Not divisible by 5 and 3");
        }

    }
}

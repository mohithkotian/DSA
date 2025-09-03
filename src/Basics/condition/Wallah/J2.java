package Basics.condition.Wallah;

import java.util.Scanner;

public class J2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        if(n%5==0){
            System.out.println("yes it is divisible by 5");
        }
        else System.out.println("not");
    }
}

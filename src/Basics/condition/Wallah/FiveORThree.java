package Basics.condition.Wallah;

import java.util.Scanner;
public class FiveORThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%5==0||n%3==0){
            System.out.println("the no is divisible by 3 or 5");
        }
        else System.out.println("hmmm");
    }
}

package Basics.condition.Wallah;

import java.util.Scanner;
//take positive integer and tell if it is divisible by 5 or 3 but not divisible by 15
public class NestedIfelse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%5==0){
            if (n%3==0){
            System.out.println("the number is divisible 3 and 5 both");
        }
        else {
            System.out.println("not divisible");
        }}
        else
        {
            System.out.println("Not divisible");
        }
    }
}

package Basics.condition.Wallah;
import java.util.Scanner;
public class DiviBy5NotBy3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number you like");
        int n=sc.nextInt();
        if(n%5==0&&n%3!=0){
            System.out.println("Is divisible by 5 but not 3");
        }
        else System.out.println("Not satisfy the condition");
    }
}

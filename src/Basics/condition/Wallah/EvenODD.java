package Basics.condition.Wallah;
import java.util.Scanner;
public class EvenODD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("The number you entered is even");

        }
        else System.out.println("The number is Odd");
    }
}

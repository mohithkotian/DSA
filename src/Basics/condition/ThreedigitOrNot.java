package Basics.condition;
import java.util.Scanner;
public class ThreedigitOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>99&&n<1000){
            System.out.println("this is a three digit number");
        }
        else{
            System.out.println("it is not three digit number");
        }
    }
}

package Basics.condition.Wallah;

import java.util.Scanner;

import static java.lang.System.in;

public class Marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        System.out.println("enter your mark: ");
        int marks =sc.nextInt();
        if(marks>90){
            System.out.println("excellent");
            
        }else if(marks>90){
            System.out.println("very good");
        } else if (marks>70) {
            System.out.println("good");
            
        } else if (marks>60) {
            System.out.println("average marks");
            
        } else if (marks>50) {
            System.out.println("can do better");
        } else if (marks>40) {
            System.out.println("below average");

        }else{
            System.out.println("fail");
        }
    }
}

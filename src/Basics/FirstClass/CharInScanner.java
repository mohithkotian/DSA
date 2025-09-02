package Basics.FirstClass;

import java.util.Scanner;

public class CharInScanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any character: ");
        char ch=sc.next().charAt(0);
        System.out.println("The character is:"+ ch);

    }
}

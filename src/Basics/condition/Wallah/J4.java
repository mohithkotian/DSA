package Basics.condition.Wallah;

import java.util.Scanner;

public class J4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //If cost price and selling price of an item is input through the keyboard,
        // write a program to determine whether the seller has made profit or incurred loss.
        //Also determine how much profit he made or loss he incurred.
        System.out.println("Enter the cost price: ");
        int cp=sc.nextInt();
        System.out.println("Enter the selling price: ");
        int sp=sc.nextInt();
        if(sp>cp) {
            System.out.println("You made a profit of: " +(sp - cp));
        } else{
            System.out.println("You incurred a loss of: "+(cp-sp));
        }

    }
}

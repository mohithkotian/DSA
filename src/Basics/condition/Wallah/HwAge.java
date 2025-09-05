package Basics.condition.Wallah;

import java.util.Scanner;

public class HwAge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Ram age: ");
        int Ram=sc.nextInt();
        System.out.println("enter the Shyam age: ");
        int Shyam=sc.nextInt();
        System.out.println("enter the Ajay age: ");
        int Ajay=sc.nextInt();
        if(Ram<Shyam&&Ram<Ajay){
            System.out.println("Ram is the youngest");
        }
        else if(Shyam<Ram&&Shyam<Ajay){
            System.out.println("Shyam is the youngest");
        }
        else{
            System.out.println("Ajay is the youngest");
        }
    }
}

package Basics.condition.Wallah;

import java.util.Scanner;

public class OnAxisItLies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //given a point (x,y) write a program to find out if it lies on the axis and y axis or at the origin viz(0,0)
        System.out.println("Enter the x axis points ");
        int x=sc.nextInt();
        System.out.println("Enter the y axis points");
        int y= sc.nextInt();
        if (x==0&&y==0){
            System.out.println("the point is origin");
        } else if (x==0) {
            System.out.println("this point lies in y axis");
        }
        else if(y==0){
            System.out.println("this point lies in x axis");
        }else{
        System.out.println("invalid points");
    }}
}

package Basics.condition;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        //print 1 to 5 numbers
        //use when don't know how many times the loop will run
        Scanner in =new Scanner(System.in);
        int num=1;
//        while(num<=5){
//            System.out.println(num);
//            num+=1;
//        }

        //do while
        //it always execute atleast once
        int n=1;
        do {
            System.out.println(n);
            n++;
        }while(n<=5);
    }
}

package Basics.condition;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner amount=new Scanner(System.in);
        System.out.println("enter the number of salary");
        int salary= amount.nextInt();
        if (salary > 10000){
            salary=salary+2000;
        }else {
            salary=salary+1000;
        }
        System.out.println(salary);

    }
}

package Basics.FunctionMethods;

import java.util.Enumeration;

public class Scope {
    public static void main(String[] args) {
        int a = 10;//initializing \\ declaring a new data type and inside block code Updating
        int b = 20;
        int z=0;
        String name="suresh";

        //block code
        {
            //int a =78;//already initialised but u can change the value
            a=100;//reassign the origin ref variable to some other value
            name="mohith";
            System.out.println(a);
            System.out.println(b);
            System.out.println(name);
            int c=99;
            for (int i=0;i<=4;i++){
                System.out.println(i);
                a=30;
                z=10000;
                int num=90;
            }
            System.out.println(z);
        }
        System.out.println(name);
        System.out.println(a);
        System.out.println(b);
    }
    //random  is the name of the method //marks is the parameter (variable)that belongs to  the method
    static void random(int marks){
        int num=67;
        System.out.println(num);
        System.out.println(marks);
    }
}

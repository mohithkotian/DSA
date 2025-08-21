package Basics.condition;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        //check if it is in lower case or not
        Scanner in = new Scanner(System.in);
        char ch=in.next().trim().charAt(0);


        //in.next just printing next element or word to it
        //trim() removes extra spacing btw them
        //charAt(0) index number returning char type


        if(ch >='a' && ch<='z') {
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }


    }
}

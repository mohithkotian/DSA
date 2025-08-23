package Basics.FunctionMethods;

import java.util.Scanner;

/*
        return_type name(arguments){
        //body ;
        return statement;
 */
public class StringExample {
    public static void main(String[] args) {
//        String message=greet();
//        System.out.println(message);

        Scanner in=new Scanner(System.in);
        System.out.println("enter your name");
        String name=in.next();
        String personalised = myGreet("mohith kushwaha");
        System.out.println(personalised);
    }

    static String myGreet(String name) {
        String message="hello "+name;
        return message;
    }

    static String greet(){
        String greeting ="how are you";
        return greeting;
    }
}

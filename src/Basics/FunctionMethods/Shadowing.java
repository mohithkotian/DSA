package Basics.FunctionMethods;

public class Shadowing {
    static int x=1;//this is shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x);
        int x=4;//class variable at line 4 is shadowed by this||declaring
        //sout scope will begin when value is initialized
        x=40;//initializing
        System.out.println(x);
        fun();

    }
    static void fun(){
        System.out.println(x);
    }
}

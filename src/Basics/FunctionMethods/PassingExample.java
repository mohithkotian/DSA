package Basics.FunctionMethods;

public class PassingExample {
    public static void main(String[] args) {
        String name="mohith yo";
        greet(name);
    }
    //there is no pass by reference in java
    //only passing the value
    static void greet(String naam){
        System.out.println(naam);//not changing creating new object
    }
}

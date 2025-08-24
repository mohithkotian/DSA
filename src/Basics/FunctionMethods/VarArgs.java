package Basics.FunctionMethods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,666,77,9);
       // multiple(2,34,"mohith","ram");

    }

    static void multiple(int a ,int b,String ...v){

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));

    }
}

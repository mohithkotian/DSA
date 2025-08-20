package Basics;
import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        float num =input.nextFloat();
//        System.out.println(num);

        //type casting
//        int num=(int)(76.40f);
//        System.out.println(num);

        //automatica type promotion in expression
//        int a = 257;
//        byte b=(byte)(a);//256 % 256 =1
//        System.out.println(b);

//        byte a=40;
//        byte b=50;byte c=100;//max=256 in byte
//        int d=(a*b)/c;
//        System.out.println(d);

//
//        int number='a';
//        System.out.println(number);

//        int number='a';
//        System.out.println(number);


        //rules of promotion
        //int < float
        //float * boolean = float
        //int / char = int
        //double - short=double
        //result =double


        byte b=42;
        char c='a';
        short s=1024;
        int i=5000;
        float f=5.67f;
        double d= 0.1234;
        double result=(f*b)+(i / c)-(d-s);
        System.out.println((f*b)+""+(i/c)+" "+(d-s));
        System.out.println(result);


    }
}

package Basics.Arrays;

import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(5);
        list.add(20);
        //can be added  any number input but here size is fixed
        //why this in time complexity  0(1)
        //working  basically it doubles the input or increasing the capacity
        //

        System.out.println(list);
    }
}

package Basics.Arrays;

import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(5);
        list.add(20);
        System.out.println(list);
    }
}

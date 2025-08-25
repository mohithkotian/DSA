package Basics.Arrays;

public class Arrays {
    public static void main(String[] args) {
        // store a roll number
        int a=29;
        //store a persons name
        String name="mohith";
        //store 5 roll numbers
        //datatype [] variable name = new(used to create an object  datatype [size];
        int[]  rnos= new int[5];
        //or directly
        int[] ronos={12,45,7,77,88,44};
        int[]ros;//declaration of array ros is getting defined in the stack
        ros=new int[5];//initialisation
        //1, Arrays objects are in heap
        //2, Heap objects are not continuous
        //3, Dynamic memory allocation :hence may not be continuous depends on jvm

        String[] arr=new String[4];
        System.out.println(arr[0]);

        String str=null;
        //int num=null  any reference variable  value is null
    }
}

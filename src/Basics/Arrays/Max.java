package Basics.Arrays;
import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 4, 45};
        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int Maxval=arr[0]; // first element is max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>Maxval) {
                Maxval=arr[i];
            }
        }
        return Maxval;
    }
}

package Basics.Sorting;

public class LinearSearch {
    //time complexity.....
    //best:0(1) //constant
    //worst:0(N)//size of an array
    public static void main(String[] args) {
        int [] nums={45,12,51,4,55,22,18,55,86,81,19,99,66,44,};
        int target=81;
        int ans =linearSearch(nums,target);
        System.out.println(ans);
    }

    //search in the array:return the index if item found
    //otherwise if items not found return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        //run for loop
        for (int index = 0; index < arr.length; index++) {
            int element=arr[index];
            if(element==target){
                return index;
            }
        }
        //this will execute if none of the return statements above have executed
        //hence the target not found
        return -1;
    }
}

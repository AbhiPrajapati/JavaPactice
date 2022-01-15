package Recursion;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,7};
        System.out.println(Sorted(arr,0));
    }

    private static Boolean Sorted(int[] arr, int i) {
        if(i == arr.length-1)
        {
            return true;
        }
        if(arr[i] < arr[i+1] && Sorted(arr,i+1))
        {
            return true;
        }
        return false;
    }
}

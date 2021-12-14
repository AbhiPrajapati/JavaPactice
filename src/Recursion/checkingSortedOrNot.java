package Recursion;

public class checkingSortedOrNot {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8};
        System.out.println(fun(arr,0));
    }
    private static boolean fun(int[] arr, int index)
    {
        if(index == arr.length-1)
        {
            return true;
        }
        return  (arr[index] < arr[index+1]) && fun(arr,index+1);
    }
}

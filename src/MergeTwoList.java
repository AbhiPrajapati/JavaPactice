import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoList {
    public static void main(String[] args) {
        int n,m;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for(int i =0 ; i< n ; i++)
        {
            arr1[i] = in.nextInt();
        }
        for(int i =0 ; i< m ; i++)
        {
            arr2[i] = in.nextInt();
        }
        int p = n+m;

        int[] arr = new int[p];
        for(int i = 0 ; i< n ; i++)
        {
            arr[i] = arr1[i];
        }
        for(int i = 0 ; i< m ; i++)
        {
            arr[n+i] = arr2[i];
        }


          insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0 ;j--){
                if(arr[j] > arr[j-1])
                {
                    swap(arr,j-1,j);
                }else{
                    break;
                }
            }
        }
    }
    static void swap(int[] arr,int start,int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}

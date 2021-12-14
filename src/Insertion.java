import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {10,2,5,8,7,50,4,1,100};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0 ;j--){
                if(arr[j] < arr[j-1])
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

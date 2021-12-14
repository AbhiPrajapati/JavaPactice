import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {1,5,4,2,3};
        Cysort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Cysort(int[] arr)
    {
        int i =0;
        while( i< arr.length)
        {
            if(arr[i] == i+1)
            {
                i++;
            }else{
                int j = arr[i] -1;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
    }
}

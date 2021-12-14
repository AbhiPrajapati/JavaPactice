import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] arr = {25,35,25,12,35};
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i -1;
            int max = getMax(arr,0,last);
            swap(arr,max,last);
        }
        System.out.println(Arrays.toString(arr));
    }

     static void swap(int[] arr, int max, int last) {
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }

    static int getMax(int[] arr,int start,int end) {
        int max = start;
         for (int i = start; i <= end; i++) {  // less than equal to is very much necessary here.
             if(arr[max] < arr[i])
             {
                 max = i;
             }
         }
         return max;
    }
}

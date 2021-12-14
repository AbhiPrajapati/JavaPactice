
import java.util.Arrays;

public class array {
    public static void main(String[] args) {

//        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//        for(int i =0 ; i< 3 ; i++)
//        {
//            for(int j =0; j< 3 ; j++)
//            {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }


        int[] arr = {10,203,20,30,50,50};

        int[][] arrr = {
            {1,2,3,4},
                {1,2},
                {1,2,4,5,6}
        };

        for(int[] a : arrr)
        {
            System.out.println(Arrays.toString(a));
        }

//        System.out.println(Arrays.toString(arr));
    }
}

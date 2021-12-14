import java.util.Arrays;
import java.util.Scanner;

public class MergeMatrix {
    public static void main(String[] args) {
        int n=0;
        Scanner in = new Scanner(System.in);
        int[][][] matrix = new int[n][4][4];
        int[][] getval = new int[4][4];
        for(int i =0 ; i< 4 ; i++)
        {
            for(int j =0 ; j< 4 ; j++)
            {
                getval[i][j] = in.nextInt();
            }
        }
        for(int[] i : getval) {
            System.out.println(Arrays.toString(getval));
        }
    }
}

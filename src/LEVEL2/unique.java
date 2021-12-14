package LEVEL2;

public class unique {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,2,3,4};
        System.out.println(uniqueNo(arr));
    }

    private static int uniqueNo(int[] arr) {
        int un =0;
        for(int i : arr)
        {
            un ^= i;
        }
        return un;
    }
}

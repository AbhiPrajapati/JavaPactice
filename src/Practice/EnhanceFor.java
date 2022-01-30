package Practice;

public class EnhanceFor {
    public static void main(String[] args) {
        int b = Integer.MIN_VALUE;
        int[] arr = {10,20,30,40,50,60,4000,80000};
        for(int i:arr)
        {
            if(b< i)
            {
                b = i;
            }
        }
        System.out.println("Max :"+ b);
    }
}

package Recursion;

public class Pattern1 {
    public static void main(String[] args) {
        pattern(10,0);

    }
     static void pattern(int n , int i)
    {
        if(i == n)
        {
            return;
        }
        if(n == 0)
        {
            return;
        }
        System.out.print("*");
        pattern(n,i+1);
        System.out.println();
        pattern(n-1,0);

    }
}

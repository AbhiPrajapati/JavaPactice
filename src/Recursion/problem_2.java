package Recursion;

public class problem_2 {
    public static void main(String[] args) {
        System.out.println(fun(11111110));
    }
    static int fun(int n)
    {
        if(n==0)
        {
            return 0;
        }

        return  fun(n/10) + n%10;
    }
}

package Recursion;

public class ReverseNo {

    public static void main(String[] args) {
        System.out.println(reverse(500045));
    }

    private static int reverse(int i) {
        int ans = 0;
        if(i < 0)
        {
            return ans;
        }else{
            ans = i%10  + reverse(i/10);
        }
        return ans;
    }
}

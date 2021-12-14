package LEVEL2;

public class FindTheMagicNo {
    public static void main(String[] args) {
        int no = 1;
        int ans = 0,base = 5;
        while(no>0)
        {
            int last = no & 1;
            no = no >> 1;
            ans += base * last;
            base = base * 5;
        }


        System.out.println(ans);
    }
}

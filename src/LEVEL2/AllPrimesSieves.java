package LEVEL2;

public class AllPrimesSieves {
    public static void main(String[] args) {
        int n =4000;
        boolean[] arr = new boolean[n+1];
        sieve(n,arr);
    }
    static void sieve(int n , boolean[] arr)
    {
        for (int i = 2; i*i<=n ; i++) {
            if(!arr[i])
            {
                for(int j = i*2 ;j <=n ; j+=2 )
                {
                    arr[j] = true;
                }
            }
        }
        for(int i = 2 ; i<= n ; i++)
        {
            if(!arr[i])
            {
                System.out.print(i + " ");
            }
        }
    }
}

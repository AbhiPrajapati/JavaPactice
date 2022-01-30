package DynamicProg;

import java.util.HashMap;

public class Fibo {
    static HashMap<Integer,Long> hash = new HashMap<>();
    public static long fibo(int n)
    {
        if(n <= 2) return 1;
        if(hash.containsKey(n)) return hash.get(n);

        long val =  fibo(n-1) + fibo(n-2);
        hash.put(n,val);
        return  val;
    }
    public static void main(String[] args) {
        System.out.println(fibo(50));
    }
}

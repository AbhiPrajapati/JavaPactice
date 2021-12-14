import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n= in.nextInt();
        for(int r=0; r<n; r++) {
            for(int j =0 ; j< r; j++) {
                System.out.print(fact(r) / (fact(r - j) * fact(j)) + " ");
            }
            System.out.println();
        }

    }

    static int fact(int n)
    {
        int factorial = 1;
        for(int i =2; i<=n; i++)
        {
            factorial*= n;
        }
        return factorial;
    }
}

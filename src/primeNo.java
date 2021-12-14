import java.util.Scanner;

public class primeNo {
    public static void main(String[] args) {
        int n = 100;
        boolean flag = true;
        for(int i = 2; i<= 100 ; i++)
        {
            for(int j =2 ; j*j <= i ; j++)
            {
               if(i % j == 0)
               {
                   flag = false;
                   break;
               }
            }
            if(flag)
            {
                System.out.println(i+" ");
            }
        }

    }


}

import java.util.Scanner;

public class TCS {
    public static void main(String[] args) {
        int no = 0,pos = 0;
        int count = 0;
        Scanner in = new Scanner(System.in);
        no = in.nextInt();
        pos = in.nextInt();
        boolean flag = true;
        while(no>0)
        {
            int rem = no % 10;
            count++;
            no = no/10;
            if(count == pos+1)
            {
                System.out.println(rem);
                flag = false;
                break;
            }
        }
        if(flag == true)
        {
            System.out.println(-1);
        }



    }
}

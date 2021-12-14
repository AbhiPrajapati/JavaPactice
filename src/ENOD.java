public class ENOD {
    public static void main(String[] args) {
    int count = 0;
    int[] arr = {10,100,2000,40,50,145679};
    for(int a =0 ; a< arr.length ; a++)
    {
        int c=0;
        while(arr[a] > 0)
        {
            c++;
            arr[a] /= 10;
        }
        if(c%2 == 0)
        {
            count++;
        }
    }


    System.out.println("TOTAL NUM WHICH HAVE EVEN DIGITS ARE " + count);
    }

}

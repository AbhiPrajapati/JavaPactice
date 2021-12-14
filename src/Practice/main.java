package Practice;


import java.util.Collection;

public class main  {

    public static void main(String[] args) {
        int[] arr = {20,30,40,50,2,3,14};
        int len = arr.length;
        int earning = totalEarning(arr,len);
        System.out.println("The Total Earning is: "+earning);

    }
   public  static  int totalEarning(int[] arr,int len)
   {
       int earning = 0;

       for(int i =0 ; i< len ; i++)
       {
           if(arr[i] < 17)
           {
               earning += 200;
           }else if(arr[i] >= 17 && arr[i] < 40)
           {
               earning += 400;
           }else{
               earning += 300;
           }
       }
       return earning;
   }
}

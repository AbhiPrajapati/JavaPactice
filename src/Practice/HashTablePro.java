package Practice;

import java.util.Arrays;
import java.util.Hashtable;

public class HashTablePro {
//    "Check for the First Recurring Character"
    //public static  Hashtable<Integer,Integer> hash = new Hashtable<>();
    public static int FindRec(int [] arr)
    {
        Hashtable<Integer,Integer> hash = new Hashtable<>();
        for (int i = 0; i < arr.length; i++) {
            if(hash.containsKey(arr[i]))
            {
                return arr[i];
            }else{
                hash.put(arr[i],i);
            }
        }
        return  -1;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,20,10,15};
        System.out.println(FindRec(arr));


//       hash.forEach((item,item2)-> {
//           System.out.println(item+" "+ item2);
//       });

    }
}

package Practice;

import java.sql.Array;

public class New {
    public static void main(String[] args) {
//        N = 4
//        S = 0010
//        C[N]={1,0,4,0}

        int N =6;
        String  S = "001010";
        int[] C = {1, 0, 4, 2,10,5};
        System.out.println(solve(N,S,C));

    }
    public static  int solve(int N, String s, int [] C){
       char[] arr = s.toCharArray();

         int cost  = 0;
            if(arr[0] == arr[1])
            {
                for (int i = 0; i < N-1; i+=2) {
                    if(arr[i] == arr[i+1])
                    {

                        continue;
                    }else{
                        if(arr[i-2] == arr[i])
                        {

                            arr[i+1] = arr[i];
                            cost = cost + C[i];
                        }else{
                            arr[i] = arr[i-2];
                            cost = cost + C[i+1];
                        }
                    }

                }
                return cost;
            }else{
                for (int i = 0; i < N; i+=2) {
                    if(arr[i] != arr[i+1])
                    {
                        continue;
                    }else{
                        if(arr[i-2] == arr[i])
                        {
                            if(arr[i-2] == '0')
                            {
                                arr[i+1] = '1';
                                cost += C[i+1];
                            }else{
                                arr[i+1] = '0';
                                cost += C[i+1];
                                 }
                        }else{
                            if(arr[i] == '0')
                            {
                                arr[i] = '1';
                                cost += C[i];
                            }else{
                                arr[i] = '0';
                                cost += C[i];
                            }
                        }
                    }
                }
            }


       return  cost;
    }


}
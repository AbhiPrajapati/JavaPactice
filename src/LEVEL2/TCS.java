package LEVEL2;

import java.util.Scanner;

public class TCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        int res = 1;
        int track = 0;
        for(int i =0; i<n;i++){
            arr[i] = sc.nextInt();
            track+= arr[i];
            if(track<1){
                res = Math.max(res,1-track);
            }
        }
        System.out.println(res);
    }
}

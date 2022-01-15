package Practice;

import java.util.Arrays;

class Solution {
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] tar = new int[nums.length];
        for(int i=0 ; i< tar.length ; i++) tar[i] = -1;


        for(int i =0 ; i< nums.length ; i++)
        {
            if(tar[index[i]] == -1){
                tar[index[i]] = nums[i];
            }else{
                rotate(tar,index[i]);
                tar[index[i]] = nums[i];
            }
            
        }
        return tar;
    }

    @Override
    public String toString() {
        return "";
    }

    static void rotate(int[] tar , int j )
    {
        for(int i = j ; i < tar.length  ; i++)
        {
            tar[j+1] = tar[j];
        }
    }

    public static void main(String[] args) {
        int []nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        Solution sol = new Solution();
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }
}
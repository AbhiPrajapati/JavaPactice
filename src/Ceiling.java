public class Ceiling {
    public static void main(String[] args) {
        int[] arr = { 1,22,33,85,105,666};
        System.out.println(findingCeil(arr,600));

    }
    static  int findingCeil(int[] arr , int tar)
    {
        int start =0 ;
        int end = arr.length-1;
        int ans=0;
        while(start<=end)
        {
            int mid = start +(end-start)/2;
            if(arr[mid] == tar)
            {
                return mid;
            }
            if(arr[mid] < tar)
            {
                 start = mid+1;
            }else{
                end = mid-1;
            }

        }
        return start;
    }
}

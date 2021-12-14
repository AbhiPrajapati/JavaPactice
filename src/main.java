public class main{
    public static void main(String args[]) {

        int[] arr = {0,20,50,10,4,6,8,92};
        int tar = 20;
        System.out.println(binarySearch(arr,tar));

    }

    static int binarySearch(int[] arr,int tar)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = start + (end - start)/2;

            if(arr[mid] == tar)
            {
                return mid;
            }
            if(arr[mid] < tar)
            {
                end = mid-1;
            }else{
                start = mid +1;
            }
        }
        return -1;


    }
}
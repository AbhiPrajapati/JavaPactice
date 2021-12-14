public  class BinarySearch {
    public static void main(String[] args) {
       // int[] arr = { 1,2,3,4,5,6,7,8,9};
        int[] arr = {9,8,7,6,5,4,3,2,1};
        System.out.println(binarySearch(arr,5));
    }


    static int binarySearch(int[] arr,int tar)
    {
        boolean asc;
        int start = 0;
        int end = arr.length-1;
        if(arr[start] < arr[end])
        {
            asc = true;
        }else{
            asc = false;
        }
        while(start <= end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid] == tar)
            {
                return  mid;
            }
            if(asc== true){
                if(arr[mid] > tar)
            {
                end = mid-1;
            }else{
                start = mid+1;
            }
            }else{
              if(arr[mid] > tar)
                {
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
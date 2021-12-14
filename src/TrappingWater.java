//
//
//public class TrappingWater {
//    public static void main(String[] args) {
//        int[] arr = { 0,1,0,2,1,0,1,3,2,1,2,1};
//        int n = arr.length;
//        int[] left = new int[n];
//        int[] right = new int[n];
//
//        left[0] = arr[0];
//        for(int i =1 ; i< n ; i++)
//        {
//                left[i] = Math.max(arr[i],left[i-1]);
//            }
//
//        }
//
//        right[n-1] = arr[n-1];
//        for(int i =n-2 ; i>= 0 ; i--)
//        {
//
//                right[i] = Math.max(arr[i],right[i+1]);
//            }
//
//        }
//
////        System.out.println(Arrays.toString(left));
////        System.out.println(Arrays.toString(right));
//        System.out.println(trapedWater(left,right,arr));
//    }
//
//    static int trapedWater(int[] l,int[] r,int[] a)
//    {
//        int ans = 0;
//        for(int i =0 ; i< a.length; i++)
//        {
//            ans += Math.min(l[i],r[i]) - a[i];
//        }
//        return ans;
//    }
//}

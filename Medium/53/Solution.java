import java.util.*;
public class Solution {

    // Method 1 O(n^2)

    // static int maxSubArray(int[] nums) {
    //     // Arrays.sort(nums);
    //     // System.out.println(Arrays.toString(nums));
    //     int maxsum=Integer.MIN_VALUE;
    //     System.out.println(maxsum);
    //     for (int i = 0; i <= nums.length-1; i++) {
    //         int presentsum=0;
    //         for (int j = i; j <= nums.length-1; j++) {
    //             presentsum+=nums[j];
    //             if(presentsum>maxsum){
    //                 maxsum=presentsum;
    //             }
    //         }
    //     }
      
    //     return maxsum;
    // }


    // Method 2  O(n)
    static int maxSubArray(int[] nums) {
        int sum=0;
        int maxxx=nums[0];
        for (int j = 0; j < nums.length; j++) {
            sum+=nums[j];
            maxxx=max(maxxx,sum);
            if(sum<0){
                sum=0;
            }
        }
        return maxxx;
    }

    static int max(int a , int b ) {
        if(a>b){
            return a;
        }
        return b;
    }
    
    public static void main(String[] args) {
        int [] arr ={-2,1,-3,4,-1,2,1,-5,4};
        int x= maxSubArray(arr);
        System.out.println(x);
    }
    
}



public class Solution {
    public static long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int minsum=0,squred;
        int k1time=k1,k2time=k2;
        for (int i = 0; i < nums1.length; i++) {
            if(nums1[i]>nums2[i] && k2time==k2){
                squred=(nums1[i]-(nums2[i]+1))*(nums1[i]-(nums2[i]+1));
                minsum=minsum+squred;
                //  System.out.println(nums1[i]+" "+(nums2[i]+k2));
                k2time++;
            }
            else if(nums1[i]<nums2[i] && k1time==k1){
                squred=((nums1[i]+1)-nums2[i])*((nums1[i]+1)-nums2[i]);
                minsum=minsum+squred;
               //  System.out.println((nums1[i]+k1)+" "+nums2[i]);
                k1time++;
            }
            else{
                squred=(nums1[i]-nums2[i])*(nums1[i]-nums2[i]);
                minsum=minsum+squred;
                // System.out.println((nums1[i]+k1)+" "+nums2[i]);
            }
           
        }

        return minsum;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,4,10,12}, nums2 = {5,8,6,9};
        int k1 = 10, k2 = 5;
        long minsum=minSumSquareDiff(nums1, nums2, k1, k2);
        System.out.println(minsum);
    }
}

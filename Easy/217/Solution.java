import java.util.*;
import java.util.Scanner;
class Solution{
    static  boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        int ele=nums[0];
        for (int i =0;i<nums.length;i++) {
            // System.out.println(nums[i]);
            if (i==nums.length-1) {
                break;
            }
            if (nums[i]==nums[i+1]) {
                return true;
            }
        }
    
        return false;
        
    }

    public static void main(String[] args) {
        boolean t;
        int[] nums={2,14,128,23,22};
        t=containsDuplicate(nums);
        System.out.println(t);

    }
}

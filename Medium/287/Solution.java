import java.util.Arrays;

public class Solution {
    public static int findDuplicate(int[] nums) {
        int i=0;
        while (i<nums.length) {
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct] ){ 
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else{
                i++;
            }
        }
        int n=nums.length-1;


        return nums[n];
    }


    public static void main(String[] args) {
        int[] nums={1,3,4,2,2};
        System.out.println(Arrays.toString(nums));
        int missnum=findDuplicate(nums);
        System.out.println("\nSorted (CycleSort):");
        System.out.println(Arrays.toString(nums));
        System.out.println("missing number : "+missnum);
    }
}




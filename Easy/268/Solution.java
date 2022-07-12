import java.util.Arrays;

public class Solution {
    public static int missingNumber(int[] nums) {
        int i=0;
        while (i<nums.length) {
            int correct=nums[i];
            if(correct!=nums.length && nums[i]!=nums[correct] ){ 
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else{
                i++;
            }
        }
        int missnum;

        // case 1: [3,0,1] ---> missing number 2
        for (int j = 0; j < nums.length; j++) {
            if(j!=nums[j]){
                missnum=j;
                return missnum;
            }
        }


        // case 2: [0,1,2] ---> missing number 3
        return nums.length;
    }


    public static void main(String[] args) {
        int[] nums={3,0,1};
        System.out.println(Arrays.toString(nums));
        int missnum=missingNumber(nums);
        System.out.println("\nSorted (CycleSort):");
        System.out.println(Arrays.toString(nums));
        System.out.println("missing number : "+missnum);
    }
}




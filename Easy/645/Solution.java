import java.util.Arrays;

class Solution {
    public static int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length){
            int choice=nums[i]-1;
            if(nums[i]!=nums[choice]){
                int temp=nums[i];
                nums[i]=nums[choice];
                nums[choice]=temp;
            }
            else{
                i++;
            }
        }
        for (int k = 0; k < nums.length; k++) {
            if (k+1!=nums[k]) {
               return new int[] {nums[k],k+1};
            }
        }


        return new int[] {-1,-1};
    }

}
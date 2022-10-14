import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> findDuplicates(int[] nums) {
        int i=0;
        List <Integer> listt=new ArrayList<Integer>();
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

        System.out.println(Arrays.toString(nums));
        for (int j = 0; j < nums.length; j++) {
            if(j!=nums[j]-1){
                listt.add(nums[j]);
            }
        }
        return listt;
    }


    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        System.out.println(Arrays.toString(nums));
        List<Integer> listt =new ArrayList<>(){};
        listt=findDuplicates(nums);
        System.out.println("\nSorted (CycleSort):");
        for (int i = 0; i < listt.size(); i++) {
            System.out.println(listt.get(i));
        }
    }
}




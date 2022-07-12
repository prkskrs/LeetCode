import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class Solution {
    public static List<Integer> findDisappearedNumbers(int[] nums) {

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

            List<Integer> listt=new ArrayList<Integer>();
            System.out.println(Arrays.toString(nums));

            for (int j = 0; j <nums.length; j++) {
                if(j!=nums[j]-1){
                    System.out.println(j+1);
                    listt.add(j+1);
                }
            }
    
    
            return listt;
        }

        public static void main(String[] args) {
          //  int[] nums={4,3,2,7,8,2,3,1};
            int[] nums={4,3,2,7,8,2,3,1};
            List<Integer> listt=new ArrayList<Integer>();
            listt=findDisappearedNumbers(nums);
            for (int i = 0; i < listt.size(); i++) {
                System.out.println(listt.get(i));
            }
        }
    }


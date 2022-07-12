import java.util.Arrays;

public class Solution {
    public static int splitArray(int[] nums, int m) {
        int n=nums.length;
        int sum=0,element=0;
        int[] newn=new int[m];
        int bin=n/m;
        int[] f=new int[nums.length];
        int k=0,l=0;
        int tum=0;
         System.out.println("bin " + bin);
        for (int i = 0; i < m; i++) {
           if(i==0 && n%m!=0){
            //    for (int j = 0; j < bin+1; j++) {
            //        sum+=nums[k];
            //        k++;
            //    }
            for (int j = 0; j <nums.length; j++) {
                l=j;
                for (int s = 0; s < bin+1; s++) {
                    System.out.println(l);
                    tum+=nums[l];
                    
                    l++;
                    if(l==nums.length){
                        break;
                    }
                }
                f[j]=tum;
                System.out.println(f[j]);
                tum=0;

            }
            System.out.println(Arrays.toString(f));
                element=f[0];
                for (int p = 0; p < f.length; p++) {
                if(element>f[p]){
                    element=f[p];
                }
                }

               newn[i]=element;
               System.out.println(newn[i]);
           }
           else{
                for (int j = 0; j < bin; j++) {
                    sum+=nums[k];
                    k++;
                }
                newn[i]=sum;
                 System.out.println(newn[i]);
                sum=0;
           }
        }
        System.out.println(Arrays.toString(newn));
        element=newn[0];
        for (int i = 0; i < newn.length; i++) {
            if(element<newn[i]){
                element=newn[i];
            }
        }
        return element;
   

    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3}; 
        int m = 5;
        int res=splitArray(nums, m);
        System.out.println(res);
    }
}

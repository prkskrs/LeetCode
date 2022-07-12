class Solution {

    // Primary Method  // fast
    // public static int findNumbers(int[] nums) {
    //     int dig=0,count=0,countEvenDig=0;
    //     for (int i = 0; i < nums.length; i++) {
    //         count=0;
    //         for (int j = nums[i]; j >0;  j=j/10) {
    //              dig=j%10;
    //              count++;
    //         }
    //         System.out.println(count);
    //         if(count%2==0){
    //             countEvenDig++;
    //         }

    //     }
    //     return countEvenDig; 
    // }

    // Shortcut Method // slower than above

    public static int findNumbers(int[] nums) {
        int dig=0,countEvenDig=0;
        for (int i = 0; i < nums.length; i++) {
            dig=(int) Math.log10(nums[i])+1;
            System.out.println(dig);
            if(dig%2==0){
                countEvenDig++;
            }

        }
        return countEvenDig; 
    }


    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        int num=findNumbers(nums);
        System.out.println(num);
        // System.out.println((int)Math.log10(3242342)+1);
    }
}
import java.util.*;;
class Solution {
    static void merge(int[] nums1, int m, int[] nums2, int n) {


        int aLen = m;
        int bLen = n;
        int[] result = new int[aLen + bLen];

        System.arraycopy(nums1, 0, result, 0, aLen);
        System.arraycopy(nums2, 0, result, aLen, bLen);
        Arrays.sort(result);
        int rlen=result.length;
        System.arraycopy(result,0,nums1,0,rlen);

        System.out.println(Arrays.toString(nums1));
    }


    public static void main(String[] args) {
        int [] nums1={1,2,3,0,0,0};
        int m=3;
        int [] nums2={2,5,6};
        int n=3;
        merge(nums1, m, nums2, n);

    }
}

public class Q3105 {
    public static int longestMonotonicSubarray(int[] nums) {
        int i_max = 1;
        int d_max = 1;
        int length=1;
        for (int i = 0; i < nums.length-1; i++) {
        if (nums[i] < nums[i + 1]) {
            i_max++;
            d_max=1;
        }
       else if(nums[i]>nums[i+1]){
            d_max++;
            i_max=1;
        }
       else{
           i_max=1;
           d_max=1;
        }
        length=Math.max(length,Math.max(i_max,d_max));
    }
        return length;
    }
    public static void main(String[] args) {
        int[] nums= {3,2,1};
        System.out.println(longestMonotonicSubarray(nums));

    }

}

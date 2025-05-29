import java.util.Arrays;

public class Q2574 {
    public static int[] leftRightDifference(int[] nums) {
        int[] ans = new int[nums.length];
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum+=nums[i];
            ans[i]=sum;

        }
        sum=0;
        for(int i = nums.length-1; i >= 0; i--){
            sum+=nums[i];
            ans[i]=Math.abs(sum-ans[i]);


        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(Arrays.toString(leftRightDifference(nums)));
    }
}

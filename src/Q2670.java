import java.util.Arrays;
import java.util.HashSet;

public class Q2670 {
    public static int[] distinctDifferenceArray(int[] nums) {
        int[] ans = new int[nums.length];
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
            ans[i] = set.size();
        }
        set.clear();
        for(int i=nums.length-1; i>=0; i--){
            ans[i]-=set.size();
            set.add(nums[i]);
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] nums1 = {3};
        System.out.println(Arrays.toString(distinctDifferenceArray(nums1)));
    }
}

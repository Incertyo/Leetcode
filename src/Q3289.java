import java.util.Arrays;
import java.util.HashSet;

public class Q3289 {
    public static int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int[]ans = new int[2];int j=0;
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])&&j<2){
                ans[j] = nums[i];
                j++;
            }
            else{
                set.add(nums[i]);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {0,3,2,1,3,2};
        System.out.println(Arrays.toString(getSneakyNumbers(nums)));
    }
}

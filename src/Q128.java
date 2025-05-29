import java.util.HashSet;

public class Q128 {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            set.add(num);
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        int l_max=1,g_max=1;
        for(int i=0; i<nums.length-1; i++){
            if(set.contains(nums[i])&&set.contains(nums[i+1])){
                l_max++;
            }
            else{
                l_max=1;
            }
            g_max = Math.max(g_max,l_max);
        }
        return g_max;
    }
}

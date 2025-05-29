import java.util.HashMap;
import java.util.Map;

public class Q169 {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int e : nums) {
            map.put(e, map.getOrDefault(e, 0) + 1);
        }
        int ans = 0;
        int majorityCount = nums.length / 2;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > majorityCount) {
                ans = e.getKey();
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,3};
        System.out.println(majorityElement(arr)); // Output: 2
    }
}

import java.util.HashMap;
import java.util.Map;

public class Q1726 {
    public static int tupleSameProduct(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int res = nums[j] * nums[i];
                map.put(res, map.getOrDefault(res, 0) + 1);
            }
        }
        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            if (count >= 2) {
                int comb = count * (count - 1) / 2;
                ans += comb * 8;
            }
        }
        return ans;
    }
}

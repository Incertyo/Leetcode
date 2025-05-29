import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class Q3264 {
    public static int[] getFinalState(int[] nums, int k, int multiplier) {
       PriorityQueue<Integer> pq = new PriorityQueue<>();
       for(int i = 0; i < nums.length; i++){
           pq.offer(nums[i]);
       }
       for(int i = 0; i < k; i++){
           int curr = pq.poll();
           int idx = nums[curr];
           nums[idx] *= multiplier;
           pq.remove(curr);
           pq.offer(nums[idx]);
       }
       return nums;
    }
}

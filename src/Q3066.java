import java.util.PriorityQueue;

public class Q3066 {
    public static int minOperations(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.offer(num);
        }
        int ans = 0;
        while (!pq.isEmpty() && pq.peek() < k) {
            if (pq.size() < 2) {
                return -1; // Not enough elements to continue combining
            }
            int a = pq.poll();
            int b = pq.poll();
            ans++;
            pq.offer(a + b);
        }
        return pq.peek() >= k ? ans : -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 4, 9};
        System.out.println(minOperations(nums, 20)); // Should print 4
    }
}

import java.util.HashMap;

public class Q2364 {
    public static long countBadPairs(int[] nums) {
        long n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        long ans = 0;
        long tpairs=n*(n-1)/2;
        for (int i = 0; i < nums.length; i++) {
            int val= nums[i]-i;
            int c= map.getOrDefault(val, 0);
            ans += c;
            map.put(val,map.getOrDefault(val,0)+1);
        }
        return tpairs-ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(countBadPairs(arr));

    }
}

import java.util.*;
public class Q747 {
    public static int dominantIndex(int[] nums) {
        PriorityQueue<Integer> set = new PriorityQueue<>(Collections.reverseOrder());
        for (int e: nums){
            set.add(e);
        }
        int temp = set.poll();
        boolean check= temp>=set.element()*2;
        for(int i=0;i<nums.length&&check;i++){
            if(nums[i]==temp){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(dominantIndex(new int[]{6,4}));
    }
}

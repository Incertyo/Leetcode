import java.util.*;
public class Q2099 {
    public static int[] maxSubsequence(int[] nums, int k) {
//        doubt insane level
        PriorityQueue<Integer>set= new PriorityQueue<>(Collections.reverseOrder());
        for(int e:nums){
            set.add(e);
        }
        int [] ans = new int[k];
        HashSet<Integer> map=new HashSet<>(k);
        while(k!=0){
            map.add(set.poll());
            k--;
        }
        for(int i=0,c=0;i<nums.length&&c<ans.length;i++){
            if(map.contains(nums[i])){
                ans[c++]=nums[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        for(int e:maxSubsequence(new int[]{3,4,3,3},2)){
            System.out.println(e);
        }
    }
}

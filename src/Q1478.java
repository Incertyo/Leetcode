import java.util.HashMap;
import java.util.HashSet;

public class Q1478 {
    public static int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(map.get(nums[i])==1){
                sum+=nums[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfUnique(new int[]{1,2,3,4,5}));
    }
}

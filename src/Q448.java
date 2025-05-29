import java.util.ArrayList;
import java.util.List;

public class Q448 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans= new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++) {
            int idx = Math.abs(nums[i]);
            if (nums[idx - 1] > 0) {
                nums[idx - 1] = -nums[idx - 1];
            }
        }
       for(int i =0;i<n;i++){
           if(nums[i]>0){
               ans.add(i+1);
           }
       }
        return ans;
    }

    public static void main(String[] args) {
        for (int e:findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1})){
            System.out.print(e+" ");
        } for (int e:findDisappearedNumbers(new int[]{1,1})){
            System.out.print(e+" ");
        }
    }
}

import java.util.*;

public class Q3314 {
    public static int[] minBitwiseArray(List<Integer> nums) {
        int []ans=new int[nums.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=-1;
            for(int j=0;j<= nums.get(i);j++){
                if((j|j+1)==nums.get(i)){
                    ans[i]=j;
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        List<Integer>nums=new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(5);
        nums.add(7);
        nums.add(11);
        nums.add(13);
        nums.add(31);
        for(int e:(minBitwiseArray(nums))){
            System.out.print(e+" ");
        }
    }
}

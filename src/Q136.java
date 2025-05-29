import java.util.HashMap;
import java.util.HashSet;

public class Q136 {
        public int singleNumber(int[] nums) {
            int ans=0;
            for(int e:nums){
                ans^=e;
            }
            return ans;

    }

    public static void main(String[] args) {

    }
}

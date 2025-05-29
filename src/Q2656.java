import java.util.*;
public class Q2656 {
    public static int maximizeSum(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        for(int e:nums){
            if(e>max){
                max=e;
            }
        }
        int sum=0;
        for(int i=1;i<=k;i++){
            sum=sum+max++;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[]k={5,5,5};
        System.out.println(maximizeSum(k,2));
    }
}

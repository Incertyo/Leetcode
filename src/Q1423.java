public class Q1423 {
    class Solution {
        public int maxScore(int[] cardPoints, int k) {
            int l_sum=0,r_sum=0,max_sum=0,n=cardPoints.length;
            for(int i=0;i<k;i++){
                l_sum+=cardPoints[i];
            }
            max_sum=l_sum;
            for (int i = 0; i < k; i++) {
                l_sum -= cardPoints[k - 1 - i];
                r_sum += cardPoints[n - 1 - i];
                max_sum = Math.max(max_sum, l_sum + r_sum);
            }
            return max_sum;
        }
    }
}

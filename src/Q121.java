public class Q121 {
    public static int maxProfit(int[] prices) {
        if(prices.length==1) return 0;
        int buy=prices[0];
        int profit=0;
        int max_profit=0;
        int j=0;
        for(int i=0;i<prices.length;i++){
            if(buy>prices[i]){
                buy=prices[i];
                j=i;
            }
            else {
                profit = prices[i] - buy;
                max_profit=Math.max(max_profit,profit);

            }
        }
        return max_profit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));
    }
}

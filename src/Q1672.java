public class Q1672 {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int i =0;i<accounts.length;i++){
            int l_max=0;
            for(int j=0;j<accounts[i].length;j++){
                l_max+=accounts[i][j];
            }
            max=Math.max(l_max,max);
        }
        return max;
    }
}

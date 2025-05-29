public class Q2698 {
    private static boolean isPartition(int num,String sq,int idx,int currSum) {
        if(idx==sq.length()){
            return currSum==num;
        }
        if(currSum>num){
            return false;
        }
        for(int i=idx;i<sq.length();i++){
            int val=Integer.parseInt(sq.substring(i,idx+1));
            if(isPartition(num,sq,i+1,currSum+val)){
                return true;
            }
        }
        return false;
    }
    public static int punishmentNumber(int n) {
        int res=0;
        for(int i =1;i<=n;i++){
            String s = Integer.toString(i*i);
            if(isPartition(i,s,0,0)){
                res+=i*i;
            }
        }
        return res;
    }


}

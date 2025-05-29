public class Q338 {
    public static  int[] countBits(int n) {
int [] ans = new int[n+1];
for(int i=0;i<=n;i++){
    int a =0;
    int num =i;
    while(num!=0){
        a+=num&1;
        num=num>>1;
    }
    ans[i]=a;
}
return ans;
    }
    /*
    best solution
    class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }
}
     */

    public static void main(String[] args) {
        for(int e:countBits(5)){
            System.out.print(e+" ");
        }
    }
}

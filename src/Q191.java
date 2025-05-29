public class Q191 {
    public static int hammingWeight(long n) {
        int ans =0;
        while(n!=0){
            ans+=n&1;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(hammingWeight(11));
        System.out.println(hammingWeight(1));
        System.out.println(hammingWeight(0));
        System.out.println(hammingWeight(2));
        System.out.println(hammingWeight(2147483647));
    }
}

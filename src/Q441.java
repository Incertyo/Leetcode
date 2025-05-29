public class Q441 {
    public static int arrangeCoins(int n) {
        long l = 0;
        long r = n;
        if(n==1) return 1;
        while (l <= r) {
            long mid= l+(r-l)/2;
            long sum = (mid*(mid+1))/2;
            if (sum<n) {
                l = mid+1;
            }
            else if(sum>n) {
                r = mid-1;
            }
            else {
                return (int)mid;
            }
        }
        return (int)r;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(3));
    }
}

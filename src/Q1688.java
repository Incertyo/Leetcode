public class Q1688 {
    public static int helper(int n, int sum){
        if(n == 1){
            return sum;
        }
        return helper( n%2==0?(n/2):n/2+1,sum+(n/2));
    }

    public static int numberOfMatches(int n) {
        return helper(n,0);
    }
    public static void main(String[] args) {
        System.out.println(numberOfMatches(1));
    }
}

public class Q2601 {
    public static boolean isPrime(int n){
        if(n==1||n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static int Nearestprime(int n){
       for(int i=n-1;i>=1;i--){
           if(isPrime(i)){
               return i;
           }
       }
       return 0;
    }
    public static boolean primeSubOperation(int[] nums) {
        int n = nums.length;
        for(int i=1;i<n;i++){

        }
        return false;
    }
}

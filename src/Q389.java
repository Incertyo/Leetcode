public class Q389 {
    public static char findTheDifference(String s, String t) {
        int sum=0;
        for(int i =0;i<t.length();i++){
            sum+=(int)t.charAt(i);
        }
        for(int i =0;i<s.length();i++){
            sum-=(int)s.charAt(i);
        }
        return (char)sum;
    }
}

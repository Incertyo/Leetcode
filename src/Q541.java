public class Q541 {
    public static  String reverseWords(String s) {
        s = s.trim();
        String ans="";
        for(int i=s.length()-1;i>=0;i--){
            ans=ans+s.charAt(i);
        }
        return ans;
    }
    public static String reverseStr(String s, int k) {
        if(s.length()<k){
            return reverseWords(s);
        }
        String ans="";
return "";
    }
    public static void main(String[] args) {

    }
}

public class Q392 {
    public static  boolean isSubsequence(String s, String t) {
        int s_length= s.length();
        int t_length=t.length();
        if(s_length==0) return true;
        if(s_length>t_length) return false;
        int j=0;
        for(int i=0;i<t.length();i++){
            if(s.charAt(j)==t.charAt(i)){
                if(j==s_length-1){
                    return true;
                }
                else{
                    j++;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahgdc"));
    }
}

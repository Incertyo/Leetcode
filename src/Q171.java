public class Q171 {
    public static int titleToNumber(String columnTitle) {
        int mul=1,ans=0;
        for(int i = columnTitle.length()-1;i>=0;i--){
            ans+=mul*(int)(columnTitle.charAt(i)-'A'+1);
            mul*=26;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("AB"));
    }
}

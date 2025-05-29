public class Q3163 {
    public static String compressedString(String word) {
        String ans="";
       int idx=0,count=1;
       while(idx<word.length()-1){
           char c= word.charAt(idx);
           char nxt = word.charAt(idx+1);
           if(c==nxt){
               count++;
               idx++;
           }
           if(count==9&&idx==word.length()-1){
               return ans+count+word.charAt(idx-1);
           }
           if(count==9||c!=nxt) {
               ans = ans + count + c;
               count = 1;
               idx++;
           }
       }
       if(count!=0){
           ans=ans+count+word.charAt(word.length()-1);
       }
       return ans;
    }

    public static void main(String[] args) {
        System.out.println(compressedString("abcde"));
        System.out.println(compressedString("aaaaaaaaaaaaaabb"));
        System.out.println(compressedString("yyyyyyyyfffccccqqwwffffffffrrrrrrrrraaaaayyyyyyyyy"));
    }
}

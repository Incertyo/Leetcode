import java.util.Stack;

public class Q3174 {
//    public String clearDigits(String s) {
//        for(int i=0;i<s.length();i++){
//            if((int)s.charAt(i)>=48&&(int)s.charAt(i)<=57&&i-1>=0){
//                s=s.substring(0,i-1)+s.substring(i+1);
//                i=0;
//            }
//        }
//        return s;
//    }
    public static String clearDigits(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9'){
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            }
            else{
                stack.push(ch);
            }
        }
        s="";
        while(!stack.isEmpty()){
            s=stack.pop()+s;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(clearDigits("cb34"));
    }
}

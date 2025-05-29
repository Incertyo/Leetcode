import java.util.Stack;

public class Q1910 {
    public static String removeOccurrences(String s, String part) {
        Stack<Character> stack = new Stack<>();
        char []c=s.toCharArray();
        for(char ch:c){
            stack.push(ch);
            if(ch==part.charAt(part.length()-1)){
                int j=part.length()-1;
                while(!stack.isEmpty() &&j>=0&&stack.size()>j){
                    stack.pop();
                    j--;
                }
            }
        }
        String sb="";
        while(!stack.isEmpty()){
            sb=stack.pop()+sb;
        }
        return sb;
    }
    public static void main(String[] args) {
        System.out.println(removeOccurrences("a","aa"));
    }
}

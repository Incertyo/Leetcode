import java.util.Stack;

public class Q1221 {
    public static int balancedStringSplit(String s) {
        Stack<Character> stack = new Stack<Character>();
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            stack.push(c);
            if(c == 'L') {
                stack.pop();
            }
            count=(stack.isEmpty())?count+1:count;
        }
        return count;
    }
}

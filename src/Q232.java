import java.util.Stack;

class MyQueue {
Stack<Integer> st;
Stack<Integer> rev;
    public MyQueue() {
       st = new Stack<>();
       rev = new Stack<>();
    }

    public void push(int x) {
        st.push(x);
    }

    public int pop() {
        if(rev.isEmpty()) {
            while (!st.isEmpty()) {
                rev.push(st.pop());
            }
        }
        return rev.pop();
    }

    public int peek() {
        if(rev.isEmpty()) {
            while (!st.isEmpty()) {
                rev.push(st.pop());
            }
        }
        return rev.peek();
    }

    public boolean empty() {
        return rev.isEmpty();
    }
}
public class Q232 {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.empty());
    }
}

package Stack;

import java.util.Stack;

class MinStack {

    Stack<Integer> st = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    // Push element
    public void push(int data) {
        st.push(data);

        if (minStack.isEmpty()) {
            minStack.push(data);
        } else {
            minStack.push(Math.min(data, minStack.peek()));
        }
    }

    // Remove top element
    public void pop() {
        st.pop();
        minStack.pop();
    }

    // Return top element
    public int top() {
        return st.peek();
    }

    // Return minimum element
    public int getMin() {
        return minStack.peek();
    }
}

public class LEETCODE_155 {

    public static void main(String[] args) {

        MinStack call = new MinStack();

        call.push(5);
        call.push(3);
        call.push(7);
        call.push(2);

        System.out.println("Top: " + call.top());
        System.out.println("Min: " + call.getMin());

        call.pop();

        System.out.println("After pop:");
        System.out.println("Top: " + call.top());
        System.out.println("Min: " + call.getMin());
    }
}
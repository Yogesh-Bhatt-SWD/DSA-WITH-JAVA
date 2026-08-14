package Stack;

import java.util.Stack;

public class BalancedParenthesis {

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(ch=='('||ch=='['||ch=='{') {
                st.push(ch);
            }
            if(ch==')'||ch=='}'||ch==']') {
                if(st.isEmpty()) {
                    return false;
                }
                char top=st.peek();
                if((ch==')'&&top=='(')||(ch==']'&&top=='[')||(ch=='}'&&top=='{')) {
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String st = "))[{}(])";
        boolean ans = isValid(st);
        System.out.println(ans);
    }
}

package string;

import java.util.Stack;

public class ReverseWord {
    public static String reverseWord(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        int i=s.length()-1;
        while(i>=0) {
            char ch = s.charAt(i);
            if(ch==' '&& st.isEmpty()) {
                i--;
            }
            if(ch>='A' && ch<='Z' || ch>='a' && ch<='z') {
                st.push(ch);
                i--;
            }
            if(ch==' '&&(!st.isEmpty())) {
                char a = st.pop();
                ans.append(a);
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String s = "the sky is blue";
        String ans = reverseWord(s);
        System.out.println(ans);
    }
}

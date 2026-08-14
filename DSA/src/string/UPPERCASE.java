package string;

public class UPPERCASE {
    public static void main(String[] args) {
        String s = "YoGeShatter";
        StringBuilder result = new StringBuilder();
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(ch>=97 && ch<=122) {
                ch = (char)(ch-32);
            }
            result.append(ch);
        }
        System.out.println(result);
    }
}

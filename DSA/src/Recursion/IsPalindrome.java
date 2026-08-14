package Recursion;
import java.util.Scanner;
public class IsPalindrome {
    int isPalindrome(String s,int i,int j){
        if(i>=j) return 1;
        else if(s.charAt(i)==s.charAt(j)) {
            return isPalindrome(s,i+1,j-1);
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IsPalindrome call = new IsPalindrome();
        System.out.println("Enter the String :");
        String s = sc.nextLine();
        int i=0;
        int j=s.length()-1;
        int ans=call.isPalindrome(s,i,j);
        if(ans==1){
            System.out.println("given string is palindrome");
        }
        else{
            System.out.println("not a palindrome:");
        }
    }
}

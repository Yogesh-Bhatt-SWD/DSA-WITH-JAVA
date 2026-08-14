import java.util.Scanner;
public class Palindrome {
    public static boolean isPalindrome(int n){
        int reverse=0;
        int N=n;
        while(n>0) {
            int ld=n%10;
            reverse=(reverse*10)+ld;
            n=n/10;
        }
        if(reverse==N) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number ");
        n=sc.nextInt();
        boolean ans=isPalindrome(n);
        if(ans){
            System.out.println("Given number is palindrome ");
        }
        else{
            System.out.println("Not a Palindrome:");
        }
    }
}

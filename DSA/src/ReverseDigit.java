import java.util.Scanner;
public class ReverseDigit {
    public static int reverse_digit(int n){
        int reverse__digit=0;
        while(n>0) {
            int last_digit=n%10;
            reverse__digit=(reverse__digit*10)+last_digit;
            n=n/10;
        }
        return reverse__digit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number :");
        n=sc.nextInt();
        int reverse_number=reverse_digit(n);
        System.out.println(reverse_number);
    }
}

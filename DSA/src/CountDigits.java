import java.util.Scanner;
public class CountDigits {
    public static int  digi_count(int n) {
        int count=0;
        while(n>0) {
            int lastDigit = n % 10;
            count++;
            n = n / 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number :");
        n=sc.nextInt();
        int digit=digi_count(n);
        System.out.println("No of digit in a given Number is : "+digit);
    }
}

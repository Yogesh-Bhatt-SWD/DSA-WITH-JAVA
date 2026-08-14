import java.util.Scanner;
public class ArmstrongNumber {
    public static int armstrong(int n) {
        int ans=0;
        int N=n;
        while(n>0) {
            int ld=n%10;
            ans= (ld * ld * ld)+ans;
            n=n/10;
        }
        if(ans==N) {
            return 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number :");
        n=sc.nextInt();
        int ans=armstrong(n);
        if(ans==1) {
            System.out.println("given number is armstrong ");
        }
        else{
            System.out.println("Not a armstrong number ");
        }
    }
}

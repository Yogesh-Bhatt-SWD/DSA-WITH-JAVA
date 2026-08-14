package Recursion;
import java.util.Scanner;
public class Factorial {
    int Fact(int n){
        if(n==1){
            return 1;
        }
        return n*Fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n=sc.nextInt();
        Factorial call=new Factorial();
        System.out.println(call.Fact(n));
    }
}

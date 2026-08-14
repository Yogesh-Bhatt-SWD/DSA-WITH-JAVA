package Recursion;
import java.util.Scanner;
public class SumOfN {
    //parameterised way
    int Sum(int n,int sum){
        if(n==0) return sum;
        sum=sum+n;
        return Sum(n-1,sum);
    }
    //functional way
    int SUM(int n){
        if(n==0){
            return 0;
        }
        return n+SUM(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SumOfN call=new SumOfN();
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int sum=0;
        int ans=call.Sum(n,sum);
        System.out.println("Ans via parameterized way :"+ans);
        System.out.println("answer via functional way :"+call.SUM(n));
    }
}

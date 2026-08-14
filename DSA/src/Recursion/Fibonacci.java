package Recursion;
import java.util.Scanner;

public class Fibonacci {
    void loopFib(int n) {
        int a = 0;
        int b = 1;

        // Edge cases
        if (n >= 1) System.out.print(a + " ");
        if (n >= 2) System.out.print(b + " ");

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
    int recurFib(int n){
        if(n == 1 || n == 0 ) return n;
        int last=recurFib(n-1);
        int secondLast=recurFib(n-2);
        return last+secondLast;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fibonacci call = new Fibonacci();
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        call.loopFib(n);
        System.out.println();
        int ans= call.recurFib(n);
        System.out.println("Ans of recursion : ");
        System.out.println(ans);
        }
    }

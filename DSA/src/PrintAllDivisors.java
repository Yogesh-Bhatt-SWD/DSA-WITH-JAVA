import java.util.Scanner;
public class PrintAllDivisors {
    //     Time complexity -O(N)
    public static void PrintDiv(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number :");
        n = sc.nextInt();
        PrintDiv(n);
    }
}

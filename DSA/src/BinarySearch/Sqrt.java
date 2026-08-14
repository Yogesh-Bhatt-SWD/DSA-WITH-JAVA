package BinarySearch;

import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number : ");
        n = sc.nextInt();

        int low = 1;
        int high = n;
        int ans =1;
        while(low<=high) {
            int mid = low+(high-low)/2;
            if(mid*mid<=n) {
                ans = mid;
                low = mid+1;
            }
            else if(mid*mid>n) {
                high = mid-1;
            }
        }
        System.out.println(ans);
    }
}

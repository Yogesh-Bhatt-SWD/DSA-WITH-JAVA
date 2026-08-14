package Hashing;
import java.util.Scanner;
public class countFreqEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n;
        n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }

        int[]hash=new int[13];
        for(int i=0;i<n;i++) {
            hash[arr[i]]++;
        }
    }
}

package Recursion;
import java.util.Scanner;
public class ReverseArray {
    void reverseArray(int[]arr,int i,int j){
        if(i>=j) return;
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        reverseArray(arr,i+1,j-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ReverseArray call = new ReverseArray();
        System.out.println("Enter the length of an array:");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter the elements of an array:");
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        int i=0;
        int j=arr.length-1;
        call.reverseArray(arr,i,j);
        System.out.println("Reversed array is :");
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }
}

package sorting;
import java.util.Scanner;
public class InsertionSort {
    void insertionSort(int[]arr) {
        for(int i=0;i<arr.length-1;i++) {
            for(int j=i+1;j>0;j--) {
                if(arr[j]<arr[j-1]) {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    System.out.println("run");
                }
            }
        }
    }
    public static void main(String[] args) {
        InsertionSort call=new InsertionSort();
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n:");
        n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        call.insertionSort(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

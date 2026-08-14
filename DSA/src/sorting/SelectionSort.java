package sorting;
import java.util.Scanner;
public class SelectionSort {
     void selectionSort(int[]arr){
        int min;
        for(int i=0;i<=arr.length-2;i++) {
            min=i;
            for(int j=i;j<arr.length;j++) {
                if(arr[j]<arr[min]) {
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    public static void main(String[]args) {
         SelectionSort call=new SelectionSort();
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n:");
        n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        call.selectionSort(arr);
        System.out.println("Array after sorting :");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}

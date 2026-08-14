package sorting;
import java.util.Scanner;
public class BubbleSort {
    void bubbleSort(int[]arr) {
        for(int i=0;i<arr.length-1;i++) {
            int flag=0;
            for(int j=0;j<arr.length-1;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag++;
                }
            }
            if(flag==0) break;
        }
    }
    public static void main(String[] args) {
        BubbleSort call=new BubbleSort();
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n:");
        n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        call.bubbleSort(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

package sorting;
import java.util.Scanner;
public class MergeSort {
    void divide(int[]arr,int low,int high) {
        if(low>=high) return;
        int mid=(low+high)/2;
        divide(arr,low,mid);//for left array
        divide(arr,mid+1,high);//for right array
        merge(arr,low,mid,high);
    }
    void merge(int[]arr,int low,int mid,int high){
        int left=low;
        int right=mid+1;
        int k=0;
        int[]temp=new int[high-low+1];
        while(left<=mid&&right<=high){
            if(arr[left]<=arr[right]){
                temp[k]=arr[left];
                left++;
            }
            else{
                temp[k]=arr[right];
                right++;
            }
            k++;
        }
        while(left<=mid){
            temp[k]=arr[left];
            left++;
            k++;
        }
        while(right<=high) {
            temp[k]=arr[right];
            right++;
            k++;
        }
        for(int i=0;i<temp.length;i++) {
            arr[low+i]=temp[i];
        }
    }

    public static void main(String[] args) {
        MergeSort call=new MergeSort();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        int low=0;
        int high=arr.length-1;
        call.divide(arr,low,high);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

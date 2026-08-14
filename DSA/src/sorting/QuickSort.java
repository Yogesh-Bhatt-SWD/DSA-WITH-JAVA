package sorting;
import java.util.Scanner;

public class QuickSort {

    void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = locatePivot(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    int locatePivot(int[] arr, int low, int high) {
        int i = low;
        int j = high;
        int pivot = arr[low];

        while (i < j) {

            // move i
            while (i <= high && arr[i] <= pivot) i++;

            // move j
            while (j >= low && arr[j] > pivot) j--;

            // swap
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot correctly
        arr[low] = arr[j];
        arr[j] = pivot;

        return j;
    }

    public static void main(String[] args) {
        QuickSort call = new QuickSort();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int low = 0;
        int high = arr.length - 1;

        call.quickSort(arr, low, high);

        System.out.println("Sorted array:");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
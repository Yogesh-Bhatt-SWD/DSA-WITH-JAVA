package BinarySearch;

public class Main {
    public static boolean isFound(int [] arr ,int low ,int high ,int target) {
        while(low<=high) {
            int mid = low + (high-low)/2;
            if(arr[mid]==target) return true;
            if(arr[mid]>=arr[low]) {
                if(arr[low]<=target && arr[mid]>=target) {
                    high = mid+1;
                }
                else{
                    low = mid-1;
                }
            }
            else {
                if(arr[mid]<=target && arr[high]>=target) {
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return false;
    }
    public static void main(String[]args) {
        int [] arr = {7,8,9,1,2,3,4,5,6};
        int low = 0;
        int high = arr.length-1;
        int target = 1;
        boolean ans = isFound(arr,low,high,target);
        System.out.println(ans);

    }
}


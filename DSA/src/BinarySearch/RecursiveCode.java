package BinarySearch;
public class RecursiveCode {
    public static boolean binarySearch(int[]arr,int low,int high,int target) {
        if(low>high) return false;
        int mid = low+(high-low)/2;
        if(target==arr[mid]) return true;
        else if(target<arr[mid]) {
            return binarySearch(arr,low,mid-1,target);
        }
        else{
            return binarySearch(arr,mid+1,high,target);
        }

    }
    public static void main(String[] args) {
        int [] arr = {3,4,6,7,9,12,16,17};
        int target = 9;
        int low = 0;
        int high = arr.length-1;
        boolean ans = binarySearch(arr,low,high,target);
        System.out.println("Is present : "+ans);
    }
}

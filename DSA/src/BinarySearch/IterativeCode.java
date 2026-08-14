package BinarySearch;

public class IterativeCode {
    public static boolean binarySearch(int[]arr,int low,int high,int target_element) {
        while(!(low>high)) {
            int mid = (low+high)/2;
            if(target_element==arr[mid]) return true;
            else if(target_element<arr[mid]) {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr = {3,4,6,7,9,12,16,17};
        int target_element = 9;
        int low = 0;
        int high = arr.length-1;
        boolean ans = binarySearch(arr,low,high,target_element);
        System.out.println("is Present : "+ans);
    }
}

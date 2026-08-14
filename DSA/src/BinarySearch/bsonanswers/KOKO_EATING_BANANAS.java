package BinarySearch.bsonanswers;

public class KOKO_EATING_BANANAS {
    public static int max_ele(int[]arr) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int cal_hour(int[]arr,int speed) {
        int total_hours =0;
        for(int i=0;i<arr.length;i++) {
            total_hours = total_hours+(arr[i]+speed-1)/speed;
        }
        return total_hours;
    }
    public static void main(String[] args) {
        int [] arr = {3,6,7,11};
        int h = 8;
        int low = 1;
        int high = max_ele(arr);
        int ans = Integer.MAX_VALUE;
        while(low<=high) {
            int mid = low+(high-low)/2;
            int hours_taken = cal_hour(arr,mid);
            if(hours_taken<=h) {
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        System.out.println(ans);
    }
}

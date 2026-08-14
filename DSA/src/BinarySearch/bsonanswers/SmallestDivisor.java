package BinarySearch.bsonanswers;

public class SmallestDivisor {
    public static int max(int[]arr) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max) {
                max=arr[i];
            }
        }
        return max;
    }
    public static int findSmallDivisor(int[]arr,int num) {
        int sum =0;
        for(int i=0;i<arr.length;i++) {
            sum =  sum + (int) Math.ceil((double) arr[i] / num);
        }
       return sum;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,5,9};
        int threshold = 6;
        int max = max(arr);
        int ans =-1;
        int sum =0;
        for(int i=1;i<=max;i++) {
             sum = findSmallDivisor(arr,i);
             if(sum<=threshold) {
                 ans=i;
                 break;
             }
        }
        System.out.println(ans);
    }
}

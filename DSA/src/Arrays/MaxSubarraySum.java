package Arrays;

public class MaxSubarraySum {
    public static void main(String[] args) {
        int sum;
        int max_sum=0;
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        for(int i=0;i<arr.length;i++) {
            sum =0;
            for(int j=i;j<arr.length;j++) {
                sum+=arr[j];
                if(sum>max_sum) {
                    max_sum = sum;
                }
            }
        }
        System.out.println(max_sum);
    }
}

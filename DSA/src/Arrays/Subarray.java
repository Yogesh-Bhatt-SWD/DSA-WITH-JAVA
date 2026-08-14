package Arrays;

public class Subarray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,1,1,1,1,4,2,3};

        int SUM = 3;
        int sum = 0;
        int prevLength = 0;
        int length=0;
          //Brute Force-TIME COMPLEXITY-O(N*N*N)
//        for(int k = 0; k < arr.length; k++) {
//
//            for(int i = k; i < arr.length; i++) {
//
//                sum = 0;
//
//                for(int j = k; j <= i; j++) {
//                    sum += arr[j];
//                }
//
//                if(sum == SUM) {
//                    length=i-k+1;
//                    if(length>prevLength) {
//                        prevLength=length;
//                    }
//                }
//            }
//        }

//        System.out.println(prevLength);

        //Brute Force Optimized-O(N*N)
        for(int i=0;i<arr.length;i++) {
            sum=0;
            for(int j=i;j<arr.length;j++) {
                sum=sum+arr[j];
                if(sum==SUM) {
                    length=j-i+1;
                    if(length>prevLength) {
                        prevLength=length;
                    }
                }
            }
        }
        System.out.println(prevLength);
    }
}
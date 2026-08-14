package BinarySearch.bsonanswers;

public class Bucket {

    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int bucket(int[] arr, int day, int k) {

        int ans = 0;
        int count = 0;

        for (int j = 0; j < arr.length; j++) {

            if (arr[j] <= day) {
                count++;
            } else {
                ans += count / k;
                count = 0;
            }
        }

        ans += count / k;   // Last consecutive block

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {1, 10, 3, 10, 2};

        int m = 3;
        int k = 1;

        int max = max(arr);

        for (int day = 1; day <= max; day++) {

            int bouquets = bucket(arr, day, k);

            if (bouquets >= m) {
                System.out.println(day);
                return;
            }
        }

        System.out.println(-1);
    }
}
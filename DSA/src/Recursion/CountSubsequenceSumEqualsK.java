package Recursion;

public class CountSubsequenceSumEqualsK {

    public static int countSubsequence(int i, int sum, int k, int[] arr) {

        if (i == arr.length) {
            if (sum == k)
                return 1;
            return 0;
        }

        // Take
        sum += arr[i];
        int left = countSubsequence(i + 1, sum, k, arr);

        // Backtrack
        sum -= arr[i];

        // Not Take
        int right = countSubsequence(i + 1, sum, k, arr);

        return left + right;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 1};
        int k = 2;

        int ans = countSubsequence(0, 0, k, arr);

        System.out.println(ans);
    }
}
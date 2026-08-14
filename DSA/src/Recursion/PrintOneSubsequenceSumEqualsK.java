package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintOneSubsequenceSumEqualsK {
        public static boolean printSubsequence(List<Integer> list, int i, int sum, int k, int[] arr) {

            if (i >= arr.length) {
                if (sum == k) {
                    System.out.println(list);
                    return true;
                }
                return false;
            }

            // Take
            list.add(arr[i]);
            sum += arr[i];

            if (printSubsequence(list, i + 1, sum, k, arr))
                return true;

            list.remove(list.size() - 1);
            sum -= arr[i];

            // Not Take
            if (printSubsequence(list, i + 1, sum, k, arr))
                return true;

            return false;
        }

        public static void main(String[] args) {

            int[] arr = {3, 1, 2};
            List<Integer> list = new ArrayList<>();

            printSubsequence(list, 0, 0, 3, arr);
        }
    }


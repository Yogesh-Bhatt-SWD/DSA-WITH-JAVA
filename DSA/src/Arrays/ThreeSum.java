package Arrays;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {

        int[] arr = {-1, 0, 1, 2, -1, -4};

        /*
        // ---------------- Brute Force ----------------
        // TC = O(n^3)
        // SC = O(n)

        HashSet<List<Integer>> set = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i <= arr.length - 3; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {

                    if (arr[i] + arr[j] + arr[k] == 0) {

                        List<Integer> triplet = Arrays.asList(arr[i], arr[j], arr[k]);
                        Collections.sort(triplet);

                        if (!set.contains(triplet)) {
                            set.add(triplet);
                            ans.add(triplet);
                        }
                    }
                }
            }
        }

        System.out.println(ans);
        */


        // ---------------- Better Approach ----------------
        // TC = O(n^2)
        // SC = O(n)

        HashSet<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            HashSet<Integer> hashSet = new HashSet<>();

            for (int j = i + 1; j < arr.length; j++) {

                int third = -(arr[i] + arr[j]);

                if (hashSet.contains(third)) {

                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(arr[i]);
                    triplet.add(arr[j]);
                    triplet.add(third);

                    Collections.sort(triplet);

                    set.add(triplet);
                }

                hashSet.add(arr[j]);
            }
        }

        List<List<Integer>> ans = new ArrayList<>(set);

        System.out.println(ans);
    }
}
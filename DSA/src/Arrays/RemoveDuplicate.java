package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicate {
//Method-1(USING AUXILLARY ARRAY TIME COMPLEXITY-O(N) AND SPACE COMPLEXITY-O(N)
//    public static int[] removeDuplicate(int[] arr) {
//
//        int[] arr1 = new int[arr.length];
//        int prev = arr[0];
//        int j = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//
//            if (i == 0) {
//                arr1[j] = arr[i];
//                prev = arr1[j];
//                j++;
//            }
//
//            else if (arr[i] != prev) {
//                arr1[j] = arr[i];
//                prev = arr1[j];
//                j++;
//            }
//        }
//
//       int []ans = new int[j];
//        for(int i=0;i<ans.length;i++) {
//            ans[i]=arr1[i];
//        }
//        return ans;
//    }

    public static List<Integer> removeDuplicate(int[]arr) {
        List<Integer>list=new ArrayList<>();
        int prev=0;
        for(int i=0;i<arr.length;i++) {
            if(i==0) {
                list.add(arr[i]);
                prev=arr[i];
            }
            else if(arr[i]!=prev) {
                list.add(arr[i]);
                prev=arr[i];
            }
        }
        return list;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements into array :");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

//        int[] ans = removeDuplicate(arr);
//
//        System.out.println("Array after removing duplicates:");
//
//        for (int i = 0; i < ans.length; i++) {
//            System.out.print(ans[i] + " ");
//        }

        List<Integer>ans=removeDuplicate(arr);
        System.out.println(ans);

        sc.close();
    }
}
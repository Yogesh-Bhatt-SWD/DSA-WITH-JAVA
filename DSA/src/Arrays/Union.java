package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Union {
//   Brute-Force
//    public static void main(String[] args) {
//       Set<Integer> set = new HashSet<>();
//        int[]arr1={1,1,2,3,4,5};
//        int[]arr2={2,3,4,4,5};
//
//        for(int i=0;i<arr1.length;i++) {
//            set.add(arr1[i]);
//        }
//        for(int i=0;i<arr2.length;i++) {
//            set.add(arr2[i]);
//        }
//        System.out.println(set);
//
//    }

    public static ArrayList<Integer> union(int[]arr1,int[]arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        int i=0;
        int j=0;
        while (i < arr1.length && j < arr2.length) {


            if (arr1[i] < arr2[j]) {

                if (list.isEmpty() || list.getLast() != arr1[i]) {
                    list.add(arr1[i]);
                }
                i++;

            } else if (arr2[j] < arr1[i]) {

                if (list.isEmpty() || list.getLast() != arr2[j]) {
                    list.add(arr2[j]);
                }
                j++;

            } else {

                if (list.isEmpty() || list.getLast() != arr1[i]) {
                    list.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        while (i < arr1.length) {
            if (list.isEmpty() || list.getLast() != arr1[i]) {
                list.add(arr1[i]);
            }
            i++;
        }

        while (j < arr2.length) {
            if (list.isEmpty() || list.getLast() != arr2[j]) {
                list.add(arr2[j]);
            }
            j++;
        }

        return list;
    }
public static void main(String[] args) {
      int[]arr1={1,1,2,3,4,5};
      int[]arr2={2,3,4,4,5};
      ArrayList<Integer>Union= union(arr1,arr2);
      System.out.println(Union);
    }
}

package Recursion;

import java.util.ArrayList;
import java.util.List;

class Subsequences {
    public static void printSubsequence(List<Integer>list,int i,int[]arr) {
        if(i>=arr.length) {
            System.out.println(list);
            return;
        }
        list.add(arr[i]);
        printSubsequence(list,i+1,arr);
        list.removeLast();
        printSubsequence(list,i+1,arr);
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        List<Integer> list = new ArrayList<>();
        int i=0;
        printSubsequence(list,i,arr);
    }
}
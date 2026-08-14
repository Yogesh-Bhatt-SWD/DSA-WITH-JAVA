package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsequenceSumEqualsK {
    public static void printSubsequence(List<Integer> list, int i,int sum,int k, int[]arr) {
        if(i>=arr.length) {
            if(sum==k){
                System.out.println(list);
            }
            return;
        }
        list.add(arr[i]);
        sum+=arr[i];
        printSubsequence(list,i+1,sum,k,arr);
        list.removeLast();
        sum-=arr[i];
        printSubsequence(list,i+1,sum,k,arr);
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        List<Integer> list = new ArrayList<>();
        int sum =0;
        int i=0;
        int k =3;
        printSubsequence(list,i,sum,k,arr);
    }
}

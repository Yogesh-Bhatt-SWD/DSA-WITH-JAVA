package Arrays;

import java.util.HashMap;

public class SubArraySumEqualsK {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr= {1,2,3,1,1,1,1,4,2,3};
        int k =3;
        int sum =0;
        int maxlength=0;
        for(int i=0;i<arr.length;i++) {
            sum=sum+arr[i];
            if(sum==k) {
                maxlength=i+1;
            }
            int rem = sum-k;
            if(map.containsKey(rem)) {
                int len = i-map.get(rem);
                maxlength = Math.max(maxlength,len);
            }
            if(!map.containsKey(sum)) {
                map.put(sum,i);
            }
        }
    }
}

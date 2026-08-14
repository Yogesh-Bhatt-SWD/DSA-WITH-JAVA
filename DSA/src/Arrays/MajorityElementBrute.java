package Arrays;

public class MajorityElementBrute {
    public static void main(String[] args) {
        int [] arr = {5};
        int ans = 0;
        int count = 0;
        int n = arr.length;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(arr[i]==arr[j]) {
                    count++;
                }
            }
            if(count>n/2) {
                ans = arr[i];
            }
            count=0;
        }
        System.out.println(ans);
    }
}

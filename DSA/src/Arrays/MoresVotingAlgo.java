package Arrays;

public class MoresVotingAlgo {
    public static void main(String[] args) {

        int[] arr = {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};

        int ele = arr[0];
        int count = 0;
        int n = arr.length;

        // Boyer-Moore Voting
        for(int i = 0; i < n; i++) {

            if(arr[i] == ele) {
                count++;
            }
            else {
                count--;

                if(count == 0) {
                    ele = arr[i];
                    count = 1;   // Important
                }
            }
        }

        // Verification
        count = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] == ele) {
                count++;
            }
        }

        if(count > n / 2) {
            System.out.println(ele);
        }
        else {
            System.out.println("No Majority Element");
        }
    }
}
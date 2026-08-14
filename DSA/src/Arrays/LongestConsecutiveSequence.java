package Arrays;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {

        int[] arr = {102,4,100,1,101,3,2,1,1};

        int longest = 1;
        int count;
        int x;
        boolean found;

        for(int i = 0; i < arr.length; i++) {

            x = arr[i];
            count = 1;

            while(true) {

                found = false;

                for(int j = 0; j < arr.length; j++) {

                    if(arr[j] == x + 1) {
                        x++;
                        count++;
                        found = true;
                        break;
                    }
                }

                if(!found) {
                    break;
                }
            }

            if(count > longest) {
                longest = count;
            }
        }

        System.out.println(longest);
    }
}
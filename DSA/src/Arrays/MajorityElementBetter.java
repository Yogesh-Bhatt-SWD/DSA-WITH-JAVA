package Arrays;

import java.util.HashMap;

public class MajorityElementBetter{
    public static void main(String[] args) {

        int[] nums = {2,2,1,1,1,2,2};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Frequency count
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        // Find majority element
        for(Integer key : map.keySet()) {
            if(map.get(key) > nums.length / 2) {
                System.out.println(key);
                break;
            }
        }
    }
}
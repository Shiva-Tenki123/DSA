import java.util.Arrays;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        int[] sortedNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedNums);
        
        for (int i = 0; i < nums.length; i++) {
            res[i] = Arrays.binarySearch(sortedNums, nums[i]);
            if (res[i] < 0) {
                res[i] = 0; // Get the insertion point
            } else {
                // If the number is found, count how many times it appears
                while (res[i] > 0 && sortedNums[res[i] - 1] == nums[i]) {
                    res[i]--;
                }
            }
        }
        
        return res;
    }
}

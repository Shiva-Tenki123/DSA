class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max_point=0;
        int min_point=0;
        int prefix=0;
        for(int a:nums){
            prefix+=a;
            max_point=Math.max(max_point,prefix);
            min_point=Math.min(min_point,prefix);
        }
        return max_point-min_point;
    }
}
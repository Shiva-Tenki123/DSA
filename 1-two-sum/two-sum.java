class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm=new HashMap<Integer,Integer>();
        int n=nums.length;
        for(int i=0; i<n; i++){
            int required=target-nums[i];
            if(hm.containsKey(required)){
                return new int[]{hm.get(required),i};
            }
            else{
                hm.put(nums[i],i);
            }
        }
        return new int[]{};
        
    }
}
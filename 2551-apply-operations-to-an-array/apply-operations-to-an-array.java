class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length;
        for(int i=0; i<n-1; i++){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        int j=0;
        for(int a:nums){
            if(a!=0){
                nums[j++]=a;
            }
        }
        while(j<n){
            nums[j++]=0;
        }
        return nums;
    }
}
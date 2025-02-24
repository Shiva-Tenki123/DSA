class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=firstIndex(nums,target);
        int second=LastIndex(nums,target);
        return new int[]{first,second};
    }
    public int firstIndex(int[] nums, int target){
        int ans=-1;
        int low=0, high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>target){
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                ans=mid;
                high=mid-1;
            }
        }
        return ans;
    }
    public int LastIndex(int[] nums, int target){
        int ans=-1;
        int low=0, high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>target){
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                ans=mid;
                low=mid+1;
            }
        }
        return ans;
    }
}
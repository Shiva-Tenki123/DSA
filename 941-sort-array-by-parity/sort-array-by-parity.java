class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int arr[]=new int[nums.length];
        int i=0;
        for(int a:nums){
            if(a%2==0){
                arr[i++]=a;
            }
        }
        for(int b:nums){
            if(b%2==1){
                arr[i++]=b;
            }
        }
        return arr;
    }
}
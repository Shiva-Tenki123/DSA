class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> smaller=new ArrayList<>();
        ArrayList<Integer> middle=new ArrayList<>();
        ArrayList<Integer> larger=new ArrayList<>();
        for(int num: nums){
            if(num<pivot){
                smaller.add(num);
            }
            else if(num==pivot){
                middle.add(num);

            }
            else{
                larger.add(num);
            }
        }
        smaller.addAll(middle);
        smaller.addAll(larger);
        int res[]=new int[nums.length];
        for(int i=0; i<nums.length; i++){
            res[i]=smaller.get(i);
        }
        return res;
    }
}
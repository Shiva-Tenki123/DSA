class Solution {
    public int numOfSubarrays(int[] arr) {
        int Mod=1000000007;
        int prefix_sum=0;
        int evenCount=1;
        int OddCount=0;
        int total=0;
        for(int i=0; i<arr.length; i++){
            prefix_sum=prefix_sum+arr[i];
            if((prefix_sum&1)!=0){
                total=(total+evenCount)%Mod;
                OddCount++;
            }
            else{
                total=(total+OddCount)%Mod;
                evenCount++;
            }
        }
        return total;
    }
}
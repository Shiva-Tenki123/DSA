class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length();
        int i=0, j=0;
        int res=k;
        int count=0;
        while(j<n){
            if(blocks.charAt(j)=='W'){
                count++;
            }
            if(j-i+1==k){
                res=Math.min(res,count);
                if(blocks.charAt(i)=='W'){
                    count--;
                }
                i++;
            }
            j++;
        }
        return res;
    }
}
class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int longest=0;
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                int a=arr[i];
                int b=arr[j];
                int fibLen=FibLength(arr, a, b, n);
                if(fibLen>0) longest=Math.max(longest,fibLen+2);
            }
        }
        return longest;
    }
    public int FibLength(int arr[], int a, int b, int n){
        int fibIdx=Arrays.binarySearch(arr,a+b);
        if(fibIdx>=0 && fibIdx<n){
            return 1+FibLength(arr,b,a+b, n);
        }
        return 0;
    }
}
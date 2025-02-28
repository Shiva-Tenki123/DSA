class Solution {
    public String findLCS(String str1, String str2){
        int len1=str1.length();
        int len2=str2.length();
        int dp[][]=new int[len1+1][len2+1];
        for(int i=1; i<=len1; i++){
            for(int j=1; j<=len2; j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        StringBuilder lcs=new StringBuilder();
        int i=len1, j=len2;
        while(i>0 && j>0){
            if(str1.charAt(i-1)==str2.charAt(j-1)){
                lcs.append(str1.charAt(i-1));
                j--;
                i--;
            }
            else if(dp[i-1][j]>dp[i][j-1]){
                i--;
            }
            else{
                j--;
            }
        }
        return lcs.reverse().toString();
    }
    public String shortestCommonSupersequence(String str1, String str2) {
        StringBuilder res=new StringBuilder();
        String lcs=findLCS(str1,str2);
        int p1=0;
        int p2=0;
        for(char ch:lcs.toCharArray()){
            while(p1<str1.length() && str1.charAt(p1)!=ch){
                res.append(str1.charAt(p1++));
            }
            while(p2<str2.length() && str2.charAt(p2)!=ch){
                res.append(str2.charAt(p2++));
            }
            res.append(ch);
            p1++;
            p2++;            
        }
        res.append(str1.substring(p1));
        res.append(str2.substring(p2));
        return res.toString();

    }
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int n;
    private TreeNode solve(String traversal,int[] i, int depth){
        if(i[0]>=n){
            return null;
        }
        int j=i[0];
        while(j<n && traversal.charAt(j)=='-'){
            j++;
        }
        int dash=j-i[0];

        if(depth!=dash){
            return null;
        }
        i[0]+=dash;
        int num=0;
        while(i[0]<n && Character.isDigit(traversal.charAt(i[0]))){
            
            num=num*10+(traversal.charAt(i[0])-'0');
            i[0]++;
        }
        TreeNode root=new TreeNode(num);
        root.left=solve(traversal,i,depth+1);
        root.right=solve(traversal,i,depth+1);
        return root;
    }
    public TreeNode recoverFromPreorder(String traversal) {
        n=traversal.length();
        int i[]={0};
        int depth=0;
        return solve(traversal,i,depth);
        
    }
}
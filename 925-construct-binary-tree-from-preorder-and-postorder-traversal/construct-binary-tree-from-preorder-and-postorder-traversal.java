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
    private int preIndex=0;
    private int postIndex=0;
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        TreeNode curr=new TreeNode(preorder[preIndex]);
        preIndex++;
        if(curr.val!=postorder[postIndex]){
            curr.left=constructFromPrePost(preorder,postorder);
        }
        if(curr.val!=postorder[postIndex]){
            curr.right=constructFromPrePost(preorder,postorder);
        }
        postIndex++;
        return curr;
    }
}
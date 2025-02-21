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
class FindElements {
    private HashSet<Integer> hs=new HashSet<Integer>();
    public FindElements(TreeNode root) {
        if(root!=null){
            root.val=0;
            hs.add(0);
            recoveryBinary(root.left,1);
            recoveryBinary(root.right,2);


        }
    }
    public void recoveryBinary(TreeNode root,int val){
        if(root==null) return;
        root.val=val;
        hs.add(val);
        recoveryBinary(root.left,2*val+1);
        recoveryBinary(root.right,2*val+2);

    }
    
    public boolean find(int target) {
        return hs.contains(target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */
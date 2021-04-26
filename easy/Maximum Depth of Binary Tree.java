/**  https://leetcode.com/problems/maximum-depth-of-binary-tree/
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
    public int maxDepth(TreeNode root) {

        if(root == null){
            return 0;
        }

        int maxL = 1;
        int maxR = 1;

        if(root.left != null){
            maxL = 1 + maxDepth(root.left);
        }

        if(root.right != null){
            maxR = 1 + maxDepth(root.right);
        }


        if(maxL > maxR){
            return maxL;
        }else{
            return maxR;
        }

    }
}

//public int maxDepth(TreeNode root) {
//        if(root==null){
//            return 0;
//        }
//        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
//    }
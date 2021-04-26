/** https://leetcode.com/problems/merge-two-binary-trees/
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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        
        if(root1!=null && root2!=null){
            root1.val += root2.val;
        }else if(root1 == null){
            return root2;
        }else if(root2 == null){
            return root1;
        }
        
        if(root2.left != null){
            if(root1.left == null){
                root1.left = root2.left;
            }else{
                root1.left = mergeTrees(root1.left,root2.left);
            }

        }
        
        if(root2.right != null){
            if(root1.right == null){
                root1.right = root2.right;
            }else{
                root1.right = mergeTrees(root1.right,root2.right);
            }
        }


        return root1;
    }
}

//  public class Solution {
//     public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
//         if (t1 == null)
//             return t2;
//         if (t2 == null)
//             return t1;
//         t1.val += t2.val;
//         t1.left = mergeTrees(t1.left, t2.left);
//         t1.right = mergeTrees(t1.right, t2.right);
//         return t1;
//     }
// }

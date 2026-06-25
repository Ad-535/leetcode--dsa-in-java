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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        fun(root,l,0);
        return l;
    }
      void fun(TreeNode root,List<Integer> l,int lvl){
         if(root==null)return;

         if(lvl == l.size())
         l.add(root.val);

         fun(root.right,l,lvl+1);
         fun(root.left,l,lvl+1);
      }
}
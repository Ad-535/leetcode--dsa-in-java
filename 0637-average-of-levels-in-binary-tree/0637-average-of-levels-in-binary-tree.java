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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            int levelSize = size;   
            long sum = 0;
            while (size-- > 0) {
                TreeNode f = q.poll();
                sum += f.val;
                if (f.left != null)
                    q.add(f.left);
                if (f.right != null)
                    q.add(f.right);
            }
            ans.add((double) sum / levelSize);
        }
        return ans;
    }
}
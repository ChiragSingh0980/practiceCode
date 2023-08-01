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
    
    public List<TreeNode> allPossibleFBT(int n) {
        return solve(n);
    }
    List<TreeNode> solve(int n ){
        if(n%2 == 0) return new ArrayList<TreeNode>();
        
        if(n == 1) {
            TreeNode node = new TreeNode(0);
            return Arrays.asList(new TreeNode(0));
        }
        
        List<TreeNode> result = new ArrayList<>();
        for(int i = 1; i < n; i+=2){
            List<TreeNode> allBTLeft = solve(i);
            List<TreeNode> allBTRight = solve(n-i-1);
            
            for(TreeNode l : allBTLeft){
                for(TreeNode r : allBTRight){
                    TreeNode root = new TreeNode(0);
                    root.left = l;
                    root.right = r;
                    result.add(root);
                }
            }
        }
        return result;
    }
}
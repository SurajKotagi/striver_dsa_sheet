class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        // dfs in-order traversal
        // left - root - right
        List<Integer> ans = new ArrayList<>();
        in_order(root, ans);
        return ans;
    }

    public void in_order(TreeNode node, List<Integer> ans) {
        if (node == null)
            return;
        in_order(node.left, ans);
        ans.add(node.val);
        in_order(node.right, ans);
    }
}
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        post_order(root, ans);
        return ans;
    }

    public void post_order(TreeNode node, List<Integer> ans) {
        if (node == null)
            return;
        post_order(node.left, ans);
        post_order(node.right, ans);
        ans.add(node.val);
    }
}
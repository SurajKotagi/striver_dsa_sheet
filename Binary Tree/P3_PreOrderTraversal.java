class Solution {
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        pre_order(root, ans);
        return ans;
    }

    public static void pre_order(TreeNode node, List<Integer> ans) {
        if (node == null)
            return;
        ans.add(node.val);
        pre_order(node.left, ans);
        pre_order(node.right, ans);
    }
}
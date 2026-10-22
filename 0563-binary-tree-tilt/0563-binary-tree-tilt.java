class Solution {
    int total = 0;

    public int findTilt(TreeNode root) {
        calculateSum(root);
        return total;
    }

    private int calculateSum(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftSum = calculateSum(node.left);
        int rightSum = calculateSum(node.right);

        total += Math.abs(leftSum - rightSum);

        return leftSum + rightSum + node.val;
    }
}
package tree;

public class MaxPathSum {

    static int max = Integer.MIN_VALUE;

    public static int maxPathSum(TreeNode root) {
        maxPath(root);
        return max;
    }

    public static int maxPath(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftSum = Math.max(0, maxPath(root.left));
        int rightSum = Math.max(0, maxPath(root.right));

        // Current node par complete path
        int currentPath = leftSum + root.data + rightSum;

        // Global maximum update
        max = Math.max(max, currentPath);

        // Parent ko ek hi side ka maximum path return hoga
        return root.data + Math.max(leftSum, rightSum);
    }

    public static void main(String[] args) {

        /*
                  -10
                  /  \
                 9    20
                     /  \
                    15   7
        */

        TreeNode root = new TreeNode(-10);

        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println("Maximum Path Sum = " + maxPathSum(root));
    }
}
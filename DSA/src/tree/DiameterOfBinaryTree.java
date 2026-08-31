package tree;

public class DiameterOfBinaryTree {

    static int diameter = 0;

    static int height(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        // Diameter passing through current node
        diameter = Math.max(diameter, leftHeight + rightHeight);

        // Return height of current tree
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {

        /*
                 1
                / \
               2   3
              / \
             4   5
                / \
               6   7
        */

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.left.right.left = new TreeNode(6);
        root.left.right.right = new TreeNode(7);

        height(root);

        System.out.println("Diameter = " + diameter);
    }
}

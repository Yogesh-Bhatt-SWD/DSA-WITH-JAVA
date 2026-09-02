package tree;

public class IdenticalTree {

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        // Both nodes are null
        if (p == null && q == null) {
            return true;
        }

        // One is null and the other is not
        if (p == null || q == null) {
            return false;
        }

        // Values are different
        if (p.data != q.data) {
            return false;
        }

        // Compare left and right subtrees
        return isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {

        /*
              Tree 1             Tree 2

                 1                  1
                / \                / \
               2   3              2   3
        */

        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        System.out.println(isSameTree(p, q));
    }
}
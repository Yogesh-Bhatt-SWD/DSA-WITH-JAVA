package tree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data=data;
    }
}

public class IterativePreorderTraversalUsingStack {
    public static List<Integer> preorder(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        List<Integer> list = new ArrayList<>();
        st.push(root);

        while(!(st.isEmpty())) {
            TreeNode current = st.pop();
            list.add(current.data);
            if(current.right!=null) {
                st.push(current.right);
            }
            if(current.left!=null) {
                st.push(current.left);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left=new TreeNode(2);
        root.right= new TreeNode(7);
        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(4);
        root.left.right.left=new TreeNode(5);
        root.left.right.right=new TreeNode(6);

        List<Integer> ans = preorder(root);
        System.out.println(ans);
    }
}

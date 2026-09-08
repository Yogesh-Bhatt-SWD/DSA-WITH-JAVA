package tree;

import java.util.*;

public class Solution {
    public static List<List<Integer>> verticalOrderTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
        TreeMap<Integer,TreeMap<Integer, PriorityQueue<Integer>>> mp = new TreeMap<>();
        q.offer(new Pair(root,0,0));
        while(!(q.isEmpty())) {
            Pair pair = q.poll();
            TreeNode node = pair.node;
            int x = pair.x;
            int y = pair.y;

            if(!mp.containsKey(y)) {
                mp.put(y,new TreeMap<>());
            }
            if(!mp.get(y).containsKey(x)) {
                mp.get(y).put(x,new PriorityQueue<>());
            }
            mp.get(y).get(x).offer(node.data);

            if(node.left!=null) {
                q.offer(new Pair(node.left,x+1,y-1));
            }
            if(node.right!=null) {
                q.offer(new Pair(node.right,x+1,y+1));
            }

        }

        for (TreeMap<Integer, PriorityQueue<Integer>> ys : mp.values()) {
            ans.add(new ArrayList<>());

            for (PriorityQueue<Integer> nodes : ys.values()) {
                while (!nodes.isEmpty()) {
                    ans.get(ans.size() - 1).add(nodes.poll());
                }
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(10);
        root.left.left.right = new TreeNode(5);
        root.left.left.right.right = new TreeNode(6);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(10);
        List<List<Integer>> list = verticalOrderTraversal(root);
        System.out.println(list);
     }
}

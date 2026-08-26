package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//LEVEL ORDER TRAVERSAL
class Node{
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data=data;
    }

}
public class BFS {

    public static List<List<Integer>> bfs(Node rootNode) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.offer(rootNode);

        while(!(q.isEmpty())) {
            List<Integer>level = new ArrayList<>();

            int size = q.size();

            for(int i=0;i<size;i++) {
                Node current = q.poll();
                level.add(current.data);

                if(current.left!=null ){
                    q.offer(current.left);
                }
                if(current.right!=null) {
                    q.offer(current.right);
                }
            }
            ans.add(level);
        }
        return ans;
    }
    public static void main(String[] args) {
        Node rootNode=new Node(1);
        rootNode.left=new Node(2);
        rootNode.right=new Node(3);
        rootNode.left.left=new Node(4);
        rootNode.left.right=new Node(5);
        rootNode.right.left=new Node(6);
        rootNode.right.right=new Node(7);

        List<List<Integer>> ans = bfs(rootNode);
        System.out.println(ans);
    }
}

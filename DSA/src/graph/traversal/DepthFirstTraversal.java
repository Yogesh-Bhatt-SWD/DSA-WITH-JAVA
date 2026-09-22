package graph.traversal;

import java.util.*;

public class DepthFirstTraversal {

    public static List<Integer> dfs(List<List<Integer>> list, int n) {

        int[] visitedArray = new int[n + 1];

        List<Integer> ans = new ArrayList<>();

        dfsHelper(1, list, visitedArray, ans);

        return ans;
    }

    public static void dfsHelper(
            int node,
            List<List<Integer>> list,
            int[] visitedArray,
            List<Integer> ans) {

        // Mark current node as visited
        visitedArray[node] = 1;

        // Add current node
        ans.add(node);

        // Visit all neighbours
        for (int neighbour : list.get(node)) {

            if (visitedArray[neighbour] == 0) {
                dfsHelper(neighbour, list, visitedArray, ans);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of node : ");
        int n = sc.nextInt();

        List<List<Integer>> list = new ArrayList<>();

        // Nodes are 1 to n
        for (int i = 1; i <= n + 1; i++) {
            list.add(new ArrayList<>());
        }

        // Graph
        list.get(1).addAll(List.of(2, 6));

        list.get(2).addAll(List.of(1, 3, 4));

        list.get(3).add(2);

        list.get(4).addAll(List.of(2, 5));

        list.get(5).addAll(List.of(4, 8));

        list.get(6).addAll(List.of(1, 7, 9));

        list.get(7).addAll(List.of(6, 8));

        list.get(8).addAll(List.of(7, 5));

        // No self-loop for 9

        List<Integer> ans = dfs(list, n);

        System.out.println(ans);

        sc.close();
    }
}
package graph.traversal;

import java.util.*;

public class LevelOrderTraversal {

    public static List<List<Integer>> bfs(List<List<Integer>> list, int n) {

        int[] visitedArray = new int[n + 1];

        Queue<Integer> q = new ArrayDeque<>();

        List<List<Integer>> ans = new ArrayList<>();

        // Start BFS from node 1
        q.offer(1);
        visitedArray[1] = 1;

        while (!q.isEmpty()) {

            // Number of nodes present in current level
            int size = q.size();

            List<Integer> li = new ArrayList<>();

            // Process all nodes of current level
            //for loop because multiple nodes can be in a level
            for (int i = 0; i < size; i++) {

                int node = q.poll();

                li.add(node);

                // Visit all neighbours
                for (int neighbour : list.get(node)) {

                    if (visitedArray[neighbour] == 0) {

                        visitedArray[neighbour] = 1;
                        q.offer(neighbour);
                    }
                }
            }

            // Add current level to answer
            ans.add(li);
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of node : ");
        int n = sc.nextInt();

        List<List<Integer>> list = new ArrayList<>();

        // n + 1 because we are using nodes from 1 to n
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

        // Removed: list.get(9).add(9);
        // because it was creating a self-loop (9 -> 9)

        List<List<Integer>> ans = bfs(list, n);

        System.out.println(ans);

    }
}
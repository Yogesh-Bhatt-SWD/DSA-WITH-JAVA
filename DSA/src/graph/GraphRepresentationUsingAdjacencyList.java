package graph;

import java.util.ArrayList;

public class GraphRepresentationUsingAdjacencyList {

    public static void main(String[] args) {

        int V = 6;

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Create an empty list for every vertex
        for (int i = 0; i < V; i++) {
            list.add(new ArrayList<>());
        }

        // Edge 1 - 2
        list.get(1).add(2);
        list.get(2).add(1);

        // Edge 1 - 3
        list.get(1).add(3);
        list.get(3).add(1);

        // Edge 3 - 4
        list.get(3).add(4);
        list.get(4).add(3);

        // Edge 2 - 4
        list.get(2).add(4);
        list.get(4).add(2);

        // Edge 2 - 5
        list.get(2).add(5);
        list.get(5).add(2);

        // Edge 4 - 5
        list.get(4).add(5);
        list.get(5).add(4);

        System.out.println(list);
    }
}
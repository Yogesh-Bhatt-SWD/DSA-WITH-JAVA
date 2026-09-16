package graph;

import java.util.*;

public class RottenOranges {

    static class Pair {
        int row;
        int col;
        int time;

        Pair(int row, int col, int time) {
            this.row = row;
            this.col = col;
            this.time = time;
        }
    }

    public static int orangesRotting(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        Queue<Pair> queue = new LinkedList<>();

        int fresh = 0;
        int maxTime = 0;

        // Add all rotten oranges initially
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == 2) {
                    queue.offer(new Pair(i, j, 0));
                }

                if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        int[][] directions = {
                {-1, 0}, // up
                {1, 0},  // down
                {0, -1}, // left
                {0, 1}   // right
        };

        while (!queue.isEmpty()) {

            Pair current = queue.poll();

            int row = current.row;
            int col = current.col;
            int time = current.time;

            maxTime = Math.max(maxTime, time);

            for (int[] direction : directions) {

                int newRow = row + direction[0];
                int newCol = col + direction[1];

                if (newRow >= 0 && newRow < n &&
                        newCol >= 0 && newCol < m &&
                        grid[newRow][newCol] == 1) {

                    // Make orange rotten
                    grid[newRow][newCol] = 2;

                    fresh--;

                    // Add with time + 1
                    queue.offer(
                            new Pair(newRow, newCol, time + 1)
                    );
                }
            }
        }

        // Fresh oranges still remaining
        if (fresh > 0) {
            return -1;
        }

        return maxTime;
    }

    public static void main(String[] args) {

        int[][] grid = {
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };

        System.out.println(orangesRotting(grid));
    }
}
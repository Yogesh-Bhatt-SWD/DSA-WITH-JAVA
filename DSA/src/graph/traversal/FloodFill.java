package graph.traversal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Pair {
    int value;
    int row;
    int col;

    Pair(int value, int row, int col) {
        this.value = value;
        this.row = row;
        this.col = col;
    }
}

public class FloodFill {

    public static int[][] fillValues(int[][] grid, int sr, int sc, int color) {

        int row = grid.length;
        int col = grid[0].length;

        int[][] visited = new int[row][col];

        int originalColor = grid[sr][sc];

        // Starting pixel ko new color do
        grid[sr][sc] = color;

        Queue<Pair> q = new LinkedList<>();

        // Starting pixel queue mein add
        q.offer(new Pair(grid[sr][sc], sr, sc));
        visited[sr][sc] = 1;

        while (!q.isEmpty()) {

            Pair current = q.poll();

            int r = current.row;
            int c = current.col;

            // DOWN
            if (r + 1 < row &&
                    visited[r + 1][c] == 0 &&
                    grid[r + 1][c] == originalColor) {

                grid[r + 1][c] = color;
                visited[r + 1][c] = 1;
                q.offer(new Pair(grid[r + 1][c], r + 1, c));
            }

            // UP
            if (r - 1 >= 0 &&
                    visited[r - 1][c] == 0 &&
                    grid[r - 1][c] == originalColor) {

                grid[r - 1][c] = color;
                visited[r - 1][c] = 1;
                q.offer(new Pair(grid[r - 1][c], r - 1, c));
            }

            // RIGHT
            if (c + 1 < col &&
                    visited[r][c + 1] == 0 &&
                    grid[r][c + 1] == originalColor) {

                grid[r][c + 1] = color;
                visited[r][c + 1] = 1;
                q.offer(new Pair(grid[r][c + 1], r, c + 1));
            }

            // LEFT
            if (c - 1 >= 0 &&
                    visited[r][c - 1] == 0 &&
                    grid[r][c - 1] == originalColor) {

                grid[r][c - 1] = color;
                visited[r][c - 1] = 1;
                q.offer(new Pair(grid[r][c - 1], r, c - 1));
            }
        }

        return grid;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        int r = input.nextInt();

        System.out.println("Enter the number of Columns");
        int c = input.nextInt();

        int[][] grid = new int[r][c];

        System.out.println("Enter the elements:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                grid[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter the value of sr:");
        int sr = input.nextInt();

        System.out.println("Enter the value of sc:");
        int sc = input.nextInt();

        System.out.println("Enter the value of color:");
        int color = input.nextInt();

        int[][] ans = fillValues(grid, sr, sc, color);

        System.out.println("Flood Filled Image:");

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
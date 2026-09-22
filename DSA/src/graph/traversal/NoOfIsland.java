package graph.traversal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Pairs {
    int row;
    int col;

    Pairs(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

public class NoOfIsland {

    public static void bfs(int row, int col, int[][] grid, int[][] visited) {

        Queue<Pairs> q = new LinkedList<>();

        q.offer(new Pairs(row, col));
        visited[row][col] = 1;

        while (!q.isEmpty()) {

            Pairs pair = q.poll();

            int rows = pair.row;
            int cols = pair.col;

            // Up
            if (rows - 1 >= 0 &&
                    grid[rows - 1][cols] == 1 &&
                    visited[rows - 1][cols] == 0) {

                visited[rows - 1][cols] = 1;
                q.offer(new Pairs(rows - 1, cols));
            }

            // Down
            if (rows + 1 < grid.length &&
                    grid[rows + 1][cols] == 1 &&
                    visited[rows + 1][cols] == 0) {

                visited[rows + 1][cols] = 1;
                q.offer(new Pairs(rows + 1, cols));
            }

            // Left
            if (cols - 1 >= 0 &&
                    grid[rows][cols - 1] == 1 &&
                    visited[rows][cols - 1] == 0) {

                visited[rows][cols - 1] = 1;
                q.offer(new Pairs(rows, cols - 1));
            }

            // Right
            if (cols + 1 < grid[0].length &&
                    grid[rows][cols + 1] == 1 &&
                    visited[rows][cols + 1] == 0) {

                visited[rows][cols + 1] = 1;
                q.offer(new Pairs(rows, cols + 1));
            }
        }
    }

    public static int noOfIsland(int[][] grid) {

        int row = grid.length;
        int col = grid[0].length;

        int count = 0;

        int[][] visited = new int[row][col];

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                if (grid[i][j] == 1 && visited[i][j] == 0) {

                    bfs(i, j, grid, visited);

                    count++;
                }
            }
        }

        return count;
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

        int island = noOfIsland(grid);

        System.out.println("Number of Islands: " + island);
    }
}
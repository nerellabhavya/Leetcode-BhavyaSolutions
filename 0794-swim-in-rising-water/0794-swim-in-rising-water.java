import java.util.*;

class Solution {
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        int left = grid[0][0]; // minimum possible time
        int right = n * n - 1; // maximum possible time

        int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canReach(grid, mid, directions)) {
                right = mid; // try smaller time
            } else {
                left = mid + 1; // need more time
            }
        }
        return left;
    }

    private boolean canReach(int[][] grid, int t, int[][] directions) {
        int n = grid.length;
        boolean[][] visited = new boolean[n][n];
        Queue<int[]> queue = new LinkedList<>();
        
        if (grid[0][0] > t) return false; // cannot start yet
        queue.offer(new int[]{0,0});
        visited[0][0] = true;
        
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int x = cell[0], y = cell[1];
            if (x == n-1 && y == n-1) return true; // reached destination
            
            for (int[] dir : directions) {
                int nx = x + dir[0];
                int ny = y + dir[1];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n 
                    && !visited[nx][ny] && grid[nx][ny] <= t) {
                    visited[nx][ny] = true;
                    queue.offer(new int[]{nx, ny});
                }
            }
        }
        return false;
    }
}

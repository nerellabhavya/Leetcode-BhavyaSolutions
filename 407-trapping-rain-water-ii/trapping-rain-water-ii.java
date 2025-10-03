import java.util.*;

class Solution {
    class Cell {
        int row, col, height;
        Cell(int r, int c, int h) {
            row = r; col = c; height = h;
        }
    }
    
    public int trapRainWater(int[][] heightMap) {
        if(heightMap == null || heightMap.length == 0 || heightMap[0].length == 0) return 0;
        
        int m = heightMap.length, n = heightMap[0].length;
        boolean[][] visited = new boolean[m][n];
        PriorityQueue<Cell> pq = new PriorityQueue<>(Comparator.comparingInt(c -> c.height));
        
        // Push all border cells
        for(int i = 0; i < m; i++) {
            pq.offer(new Cell(i, 0, heightMap[i][0]));
            pq.offer(new Cell(i, n-1, heightMap[i][n-1]));
            visited[i][0] = true;
            visited[i][n-1] = true;
        }
        for(int j = 1; j < n-1; j++) {
            pq.offer(new Cell(0, j, heightMap[0][j]));
            pq.offer(new Cell(m-1, j, heightMap[m-1][j]));
            visited[0][j] = true;
            visited[m-1][j] = true;
        }
        
        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
        int water = 0;
        
        while(!pq.isEmpty()) {
            Cell cell = pq.poll();
            for(int[] dir : dirs) {
                int r = cell.row + dir[0];
                int c = cell.col + dir[1];
                if(r >= 0 && r < m && c >= 0 && c < n && !visited[r][c]) {
                    visited[r][c] = true;
                    water += Math.max(0, cell.height - heightMap[r][c]);
                    pq.offer(new Cell(r, c, Math.max(heightMap[r][c], cell.height)));
                }
            }
        }
        
        return water;
    }
}
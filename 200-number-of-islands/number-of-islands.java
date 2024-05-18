 class Solution {
    public void dfs(int i, int j, boolean[][] vis, char[][] grid) {
        int[] dRow = {-1, 0, 1, 0}; // row direction vector
        int[] dCol = {0, 1, 0, -1}; // column direction vector

        vis[i][j] = true;

        for (int dir = 0; dir < 4; dir++) {
            int newRow = i + dRow[dir];
            int newCol = j + dCol[dir];

            if (newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length
                    && grid[newRow][newCol] == '1' && !vis[newRow][newCol]) {
                dfs(newRow, newCol, vis, grid);
            }
        }
    }

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1' && !vis[i][j]) {
                    count++;
                    dfs(i, j, vis, grid);
                }
            }
        }
        return count;
    }
 }
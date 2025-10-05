class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        if (heights.length == 0 || heights[0].length == 0) return result;

        int m = heights.length, n = heights[0].length;
        boolean[][] pac = new boolean[m][n];
        boolean[][] atl = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            if (!pac[i][0]) dfsFromBorder(heights, i, 0, pac);
        }
        for (int j = 0; j < n; j++) {
            if (!pac[0][j]) dfsFromBorder(heights, 0, j, pac);
        }
        for (int i = 0; i < m; i++) {
            if (!atl[i][n - 1]) dfsFromBorder(heights, i, n - 1, atl);
        }
        for (int j = 0; j < n; j++) {
            if (!atl[m - 1][j]) dfsFromBorder(heights, m - 1, j, atl);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pac[i][j] && atl[i][j]) {
                    List<Integer> cell = new ArrayList<>();
                    cell.add(i);
                    cell.add(j);
                    result.add(cell);
                }
            }
        }
        return result;
    }

    private void dfsFromBorder(int[][] heights, int row, int col, boolean[][] reach) {
        int m = heights.length, n = heights[0].length;
        reach[row][col] = true;
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        for (int[] d : dirs) {
            int nr = row + d[0], nc = col + d[1];
            if (nr < 0 || nr >= m || nc < 0 || nc >= n) continue;
            if (reach[nr][nc]) continue;
            if (heights[nr][nc] >= heights[row][col]) {
                dfsFromBorder(heights, nr, nc, reach);
            }
        }
    }
}
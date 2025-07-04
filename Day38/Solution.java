class GfG {
    static boolean matSearch(int[][] mat, int x) {
        int n = mat.length, m = mat[0].length;
      
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(mat[i][j] == x)
                    return true;
            }
        }
      
        // If x was not found, return false
        return false;
    }

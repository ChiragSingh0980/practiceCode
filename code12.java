class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int arr[][] = new int[m][n];
        
        // tabulation
        
        for(int i=0; i<n;i++){
            if(obstacleGrid[0][i] == 1){
                for(int j = i; j < n; j++) arr[0][j] = 0;
                break;
            }
            arr[0][i] = 1;
        }
        for(int i=0; i<m;i++){
            if(obstacleGrid[i][0] == 1){
                for(int j = i; j < m; j++) arr[j][0] = 0;
                break;
            }
            arr[i][0] = 1;
        }
        
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(obstacleGrid[i][j] == 1) {arr[i][j] = 0; continue;}
                arr[i][j] = arr[i-1][j] + arr[i][j-1];
            }
        }
        return arr[m-1][n-1];
    }
}
class Solution {
    public int uniquePaths(int m, int n) {
        int [][] dp = new int [m][n];
        for(int i= 0 ; i<m ; i++){
            for(int j = 0 ; j<n ; j++ ){
                dp[i][j] = -1;
            }
        }
        return f( 0 , 0 , m , n , dp);
    }

    private int f(int i ,int j , int m , int n , int [][]dp ){
        if(i == m - 1 && j == n -1 )  return 1;
        if(i>= m || j >= n) return 0;

        if(dp[i][j] != -1) return dp[i][j];

        int right = f(i , j+1 , m , n , dp); 
        int down = f(i+1 , j , m , n , dp);

        dp[i][j] =  right + down;
        return dp[i][j];
    }
}
class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[][] = new int[coins.length][amount+1];
        for(int d[] : dp)
            Arrays.fill(d, -1);
        int ans = solve(coins, amount, 0, coins.length-1, dp);
        return ans == (int) 1e9 ? -1 : ans;
    }
    int solve(int coins[], int amt, int n, int i, int dp[][]){
        if(i == n){
            if(amt % coins[i] == 0) return amt/coins[i];
            else return (int) 1e9;
        } 
        if(dp[i][amt] != -1) return dp[i][amt];
        int take = Integer.MAX_VALUE;
        if(coins[i] <= amt) take = 1 + solve(coins, amt - coins[i], n, i, dp);
        
        int notTake = solve(coins, amt, n, i-1, dp);
        
        return dp[i][amt] = Math.min(take, notTake);
    }
}
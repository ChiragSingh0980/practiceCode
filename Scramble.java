class Solution {
    // public boolean isScramble(String s1, String s2) {
    //     int n = s1.length();
    //     boolean dp[][][] = new boolean[n + 1][n][n];
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < n; j++) {
    //             dp[1][i][j] = s1.charAt(i) == s2.charAt(j);
    //         }
    //     }
    //     for (int length = 2; length <= n; length++) {
    //         for (int i = 0; i < n + 1 - length; i++) {
    //             for (int j = 0; j < n + 1 - length; j++) {
    //                 for (int newLength = 1; newLength < length; newLength++) {
    //                     boolean dp1[] = dp[newLength][i];
    //                     boolean dp2[] = dp[length - newLength][i + newLength];
    //                     dp[length][i][j] |= dp1[j] && dp2[j + newLength];
    //                     dp[length][i][j] |= dp1[j + length - newLength] && dp2[j];
    //                 }
    //             }
    //         }
    //     }
    //     return dp[n][0][0];
    // }
    
    public boolean isScramble(String s1, String s2) {
        Map<String, Boolean> dp = new HashMap<>();
        return solve(s1, s2, dp);
    }
    boolean solve(String s1, String s2, Map<String, Boolean> dp){
        if(s1.equals(s2)) return true;
        
        if(s1.length() != s2.length()) return false;
        String key = s1 + " " + s2;
        if(dp.containsKey(key)) return dp.get(key);
        boolean result = false;
        int n = s1.length();
        
        for(int i = 1; i < n; i++){
            
            boolean swapped = solve(s1.substring(0,i), s2.substring(n-i, n), dp) && solve(s1.substring(i, n), s2.substring(0, n-i), dp);
            if(swapped) {
                result = true;
                break;
            }
            boolean notSwapped = solve(s1.substring(0, i), s2.substring(0, i), dp) && solve(s1.substring(i, n), s2.substring(i, n), dp);
            
            if(notSwapped) {
                result = true;
                break;
            }
        }
        dp.put(key, result);
        return dp.get(key);
    }
}
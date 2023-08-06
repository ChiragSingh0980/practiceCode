public class Solution {
    // public int deleteAndEarn(int[] nums) {
//         int include = 0;
//         int exclude = 0;
//         int arr[] = new int[10001];
//         for(int val : nums) arr[val]++;
        
//         for(int i = 0; i < 10001; i++){
//             int ni = exclude + arr[i] * i;
//             int ne = Math.max(include, exclude);
//             include = ni;
//             exclude = ne;
//         }
//         return Math.max(include, exclude);
    // }
//         Map<Integer, Integer> mp = new HashMap<>();
//         // for(int i = 0; i < nums.length; i++){
//         //     mp.put(nums[i], mp.getOrDefault(nums[i], 0)+1);
//         // }
//         // System.out.println(mp);
//         int n = nums.length;
//         int sum = Integer.MIN_VALUE;
//         for(int i = 0; i < n ;i++){
//             for(int j = 0; j < nums.length; j++){
//                 mp.put(nums[j], mp.getOrDefault(nums[j], 0)+1);
//             }
//             sum = Math.max(sum, earned(nums[i], mp, 0));
//         }
//         return 0;
//     }
//     int earned(int num, Map<Integer, Integer> mp, int sum) {
//         if(mp.isEmpty()) return 0;
//         mp.remove(num-1);
//         mp.remove(num+1);
//         sum += mp.get(num);
//         if(mp.get(num)-1 > 0) 
//             mp.put(mp.get(num), mp.get(num)-1);
//         Map.Entry<Integer, Integer> entry = mp.entrySet().iterator().next();
//         Integer key= entry.getKey();
//         if (key.isPresent()) {
//             // Integer key = firstKey.get();
//             earned(key, mp, sum);
//         }
//         else earned(-1, mp, sum);
            
        
//         return sum;
//     }
    public int deleteAndEarn(int[] nums) {
        int max=0;
        for(int x:nums)
            max = Math.max(max,x);
        int[] a = new int[max+1];
        
        for(int x:nums)
            a[x]++;
        Integer[] dp = new Integer[max+1];
        return solve(a,1,dp);
    }

    private int solve(int[] a,int i,Integer[] dp){
        if(i>=a.length){
            return 0;
        }
        if(dp[i]!=null){
            return dp[i];
        }
        int pick = a[i]*i + solve(a,i+2,dp);
        int notPick = solve(a,i+1,dp);

        return dp[i] = Math.max(pick,notPick);
    }
} {
    
}

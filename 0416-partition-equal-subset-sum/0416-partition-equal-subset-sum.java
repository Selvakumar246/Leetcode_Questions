class Solution {
    public boolean canPartition(int[] nums) {
           int sum = 0;
        for (int num : nums) {
            sum += num;//6
        }
        
        if (sum % 2 != 0) {
            return false;
        }

        int target = sum / 2;//3

        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        for (int num : nums) {//3
            for (int j = target; j >= num; j--) {//2>=3
                dp[j] = dp[j] || dp[j - num];
//t||t
            }
        }

        return dp[target];  
    }    
}
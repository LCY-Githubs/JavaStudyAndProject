public class Offer089 {

    public int rob(int[] nums) {
        //动态规划做题
        //状态表示dp[i][0]表示到第i件房间偷的最大金额
        //状态表示dp[i][1]表示到第i件房间不偷的最大金额
        //dp[i][0] = dp[i-2][0]+i
        //DP[i][1] = dp[i-1][1]

        //dp[i] = dp[i-1],dp[i-2]
        if (nums == null || nums.length == 0) return 0;
        int n = nums.length;
        if (n == 1) return nums[0];
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[n - 1];
    }
}

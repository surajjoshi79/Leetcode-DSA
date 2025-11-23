class Solution {
    public int maxSumDivThree(int[] nums) {
        int[] dp = new int[3];
        for (int a : nums)
            for (int i: Arrays.copyOf(dp, dp.length))
                dp[(i + a) % 3] = Math.max(dp[(i + a) % 3], i + a);
        return dp[0];
    }
}
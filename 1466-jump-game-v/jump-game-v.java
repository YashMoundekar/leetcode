class Solution {

    public int maxJumps(int[] arr, int d) {

        int n = arr.length;
        int[] dp = new int[n];

        int ans = 1;

        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, dfs(arr, d, i, dp));
        }

        return ans;
    }

    public int dfs(int[] arr, int d, int idx, int[] dp) {

        if (dp[idx] != 0) {
            return dp[idx];
        }

        int max = 1;

        // RIGHT
        for (int i = idx + 1; i <= Math.min(arr.length - 1, idx + d); i++) {

            // stop if blocked
            if (arr[i] >= arr[idx]) {
                break;
            }

            max = Math.max(max, 1 + dfs(arr, d, i, dp));
        }

        // LEFT
        for (int i = idx - 1; i >= Math.max(0, idx - d); i--) {

            // stop if blocked
            if (arr[i] >= arr[idx]) {
                break;
            }

            max = Math.max(max, 1 + dfs(arr, d, i, dp));
        }

        dp[idx] = max;

        return max;
    }
}
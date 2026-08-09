class Solution {

     int[][] dp;
    int[] suffix;

    public int stoneGameII(int[] piles) {
        int n = piles.length;

        dp = new int[n][n + 1];
        suffix = new int[n + 1];

        for(int i = n - 1; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + piles[i];
        }

        return dfs(0, 1, piles);
    }

    private int dfs(int i, int M, int[] piles) {
        if(i >= piles.length) {
            return 0;
        }

        if(dp[i][M] != 0) {
            return dp[i][M];
        }

        int n = piles.length;

        if(2 * M >= n - i) {
            return dp[i][M] = suffix[i];
        }

        int best = 0;

        for(int X = 1; X <= 2 * M && i + X <= n; X++) {

            int newM = Math.max(M, X);

            int opponent = dfs(i + X, newM, piles);

            int current = suffix[i] - opponent;

            best = Math.max(best, current);
        }

        return dp[i][M] = best;
    }
}
class Solution {
     static class Pair {
        long cnt;
        long wav;

        Pair(long cnt, long wav) {
            this.cnt = cnt;
            this.wav = wav;
        }
    }

    String s;
    Pair[][][][] memo;
    boolean[][][][] seen;

    public long totalWaviness(long num1, long num2) {
        return solve(num2) - solve(num1 - 1);
    }

    private long solve(long x) {
        if (x < 0) return 0;

        s = String.valueOf(x);

        int n = s.length();

        memo = new Pair[n + 1][11][11][2];
        seen = new boolean[n + 1][11][11][2];

        return dfs(0, 10, 10, 0, true).wav;
    }

    private Pair dfs(int pos, int prev2, int prev1, int started, boolean tight) {

        if (pos == s.length()) {
            return new Pair(1, 0);
        }

        if (!tight && seen[pos][prev2][prev1][started]) {
            return memo[pos][prev2][prev1][started];
        }

        int limit = tight ? s.charAt(pos) - '0' : 9;

        long totalCnt = 0;
        long totalWav = 0;

        for (int d = 0; d <= limit; d++) {

            boolean newTight = tight && (d == limit);

            if (started == 0 && d == 0) {

                Pair nxt = dfs(pos + 1, 10, 10, 0, newTight);

                totalCnt += nxt.cnt;
                totalWav += nxt.wav;

            } else {

                int add = 0;

                if (started == 1 && prev2 != 10) {

                    if ((prev1 > prev2 && prev1 > d) ||
                        (prev1 < prev2 && prev1 < d)) {
                        add = 1;
                    }
                }

                int np2, np1;

                if (started == 0) {
                    np2 = 10;
                    np1 = d;
                } else {
                    np2 = prev1;
                    np1 = d;
                }

                Pair nxt = dfs(pos + 1, np2, np1, 1, newTight);

                totalCnt += nxt.cnt;
                totalWav += nxt.wav + (long)add * nxt.cnt;
            }
        }

        Pair ans = new Pair(totalCnt, totalWav);

        if (!tight) {
            seen[pos][prev2][prev1][started] = true;
            memo[pos][prev2][prev1][started] = ans;
        }

        return ans;
    }
}
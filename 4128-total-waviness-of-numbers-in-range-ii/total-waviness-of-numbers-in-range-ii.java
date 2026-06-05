class Solution {
    // long ans = 0;

    // for (long i = num1; i <= num2; i++) {
    //     long n = i;

    //     while (n >= 100) {
    //         long a = n % 10;
    //         long b = (n / 10) % 10;
    //         long c = (n / 100) % 10;

    //         if ((b > c && b > a) || (b < c && b < a))
    //             ans++;

    //         n /= 10;
    //     }
    // }
    // return ans;

    class Pair {
        long cnt;
        long wav;

        Pair(long cnt, long wav) {
            this.cnt = cnt;
            this.wav = wav;
        }
    }

    String num;
    Pair[][][][][] memo;

    public long totalWaviness(long num1, long num2) {
        return solve(num2) - solve(num1 - 1);
    }

    long solve(long n) {

        if (n < 0)
            return 0;

        num = String.valueOf(n);

        memo = new Pair[num.length()][11][11][2][2];

        return dfs(0, 10, 10, 1, 0).wav;
    }

    Pair dfs(int pos,
            int prev1,
            int prev2,
            int tight,
            int started) {

        if (pos == num.length())
            return new Pair(1, 0);

        if (memo[pos][prev1][prev2][tight][started] != null)
            return memo[pos][prev1][prev2][tight][started];

        int limit = tight == 1 ? num.charAt(pos) - '0' : 9;

        long totalCnt = 0;
        long totalWav = 0;

        for (int digit = 0; digit <= limit; digit++) {

            int nextTight = (tight == 1 && digit == limit) ? 1 : 0;

            if (started == 0 && digit == 0) {

                Pair child = dfs(pos + 1, 10, 10,
                        nextTight, 0);

                totalCnt += child.cnt;
                totalWav += child.wav;
            } else {

                long add = 0;

                if (started == 1 && prev2 != 10) {

                    boolean peak = prev1 > prev2 &&
                            prev1 > digit;

                    boolean valley = prev1 < prev2 &&
                            prev1 < digit;

                    if (peak || valley)
                        add = 1;
                }

                Pair child = dfs(pos + 1,
                        digit,
                        prev1,
                        nextTight,
                        1);

                totalCnt += child.cnt;

                totalWav += child.wav +
                        add * child.cnt;
            }
        }

        return memo[pos][prev1][prev2][tight][started] = new Pair(totalCnt, totalWav);
    }
}

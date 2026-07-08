import java.util.*;

class Solution {
    static final int MOD = 1_000_000_007;
    public int[] sumAndMultiply(String s, int[][] queries) {
        int n = s.length();
        ArrayList<Integer> digits = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();
        // Store non-zero digits and their positions
        for (int i = 0; i < n; i++) {
            int d = s.charAt(i) - '0';
            if (d != 0) {
                digits.add(d);
                pos.add(i);
            }
        }
        int m = digits.size();
        long[] prefixNum = new long[m + 1];
        long[] prefixSum = new long[m + 1];
        long[] pow10 = new long[m + 1];
        pow10[0] = 1;
        for (int i = 1; i <= m; i++) {
            pow10[i] = (pow10[i - 1] * 10) % MOD;
        }
        for (int i = 0; i < m; i++) {
            prefixNum[i + 1] = (prefixNum[i] * 10 + digits.get(i)) % MOD;
            prefixSum[i + 1] = prefixSum[i] + digits.get(i);
        }
        int[] next = new int[n];
        int[] prev = new int[n];
        int p = 0;
        for (int i = 0; i < n; i++) {
            while (p < m && pos.get(p) < i) {
                p++;
            }
            next[i] = (p == m) ? -1 : p;
        }
        p = m - 1;
        for (int i = n - 1; i >= 0; i--) {
            while (p >= 0 && pos.get(p) > i) {
                p--;
            }
            prev[i] = p;
        }
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            int L = next[l];
            int R = prev[r];
            if (L == -1 || R == -1 || L > R) {
                ans[i] = 0;
                continue;
            }
            int len = R - L + 1;
            long x = (prefixNum[R + 1]
                    - (prefixNum[L] * pow10[len]) % MOD
                    + MOD) % MOD;
            long sum = prefixSum[R + 1] - prefixSum[L];
            ans[i] = (int) ((x * sum) % MOD);
        }
        return ans;
    }
}
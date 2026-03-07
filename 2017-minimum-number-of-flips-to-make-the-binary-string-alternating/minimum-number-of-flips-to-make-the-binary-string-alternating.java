class Solution {
    public int minFlips(String s) {
        int n = s.length();
        int[][] pre = new int[2][n];
        int[][] suf = new int[2][n];

        for (int i = 0; i < n; i++) {
            int val = s.charAt(i) - '0';
            pre[0][i] = (i == 0 ? 0 : pre[0][i - 1]) + (val == (i % 2) ? 0 : 1);
            pre[1][i] = (i == 0 ? 0 : pre[1][i - 1]) + (val == ((i + 1) % 2) ? 0 : 1);
        }

        for (int i = n - 1; i >= 0; i--) {
            int val = s.charAt(i) - '0';
            suf[0][i] = (i == n - 1 ? 0 : suf[0][i + 1]) + (val == (i % 2) ? 0 : 1);
            suf[1][i] = (i == n - 1 ? 0 : suf[1][i + 1]) + (val == ((i + 1) % 2) ? 0 : 1);
        }

        int ans = Math.min(pre[0][n - 1], pre[1][n - 1]);

        if (n % 2 != 0) {
            for (int i = 0; i < n - 1; i++) {
                ans = Math.min(ans, pre[0][i] + suf[1][i + 1]);
                ans = Math.min(ans, pre[1][i] + suf[0][i + 1]);
            }
        }

        return ans;
    }
}
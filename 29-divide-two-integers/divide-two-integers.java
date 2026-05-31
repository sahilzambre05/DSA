class Solution {
    public int divide(int dividend, int divisor) {
        
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);

        int ans = 0;

        while (dvd >= dvs) {
            int cnt = 0;

            while (dvd >= (dvs << (cnt + 1))) {
                cnt++;
            }

            ans += (1 << cnt);
            dvd -= (dvs << cnt);
        }

        if ((dividend < 0) ^ (divisor < 0)) {
            ans = -ans;
        }

        return ans;
    }
}
class Solution {
    public int[] minCost(int[] nums, int[][] queries) {
        int n = nums.length;

        int[] pre = new int[n + 1];
        int[] suf = new int[n + 1];

    
        for (int i = 1; i < n; i++) {
            int cost = nums[i] - nums[i - 1];

            if (i - 1 == 0) {
                cost = 1;
            } else {
                int left = nums[i - 1] - nums[i - 2];
                int right = nums[i] - nums[i - 1];

                if (right < left) {
                    cost = 1;
                }
            }

            pre[i + 1] = pre[i] + cost;
        }


        for (int i = n - 2; i >= 0; i--) {
            int cost = nums[i + 1] - nums[i];

            if (i + 1 == n - 1) {
                cost = 1;
            } else {
                int left = nums[i + 1] - nums[i];
                int right = nums[i + 2] - nums[i + 1];

                if (left <= right) {
                    cost = 1;
                }
            }

            suf[i] = suf[i + 1] + cost;
        }

        int m = queries.length;
        int[] ans = new int[m];

        for (int i = 0; i < m; i++) {
            int l = queries[i][0];
            int r = queries[i][1];

            if (l < r) {
                ans[i] = pre[r + 1] - pre[l + 1];
            } else {
                ans[i] = suf[r] - suf[l];
            }
        }

        return ans;
    }
}
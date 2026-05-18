class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for(int i = 0;i<accounts.length;i++){
            int cnt=0;
            for(int j = 0;j<accounts[0].length;j++)
                cnt+= accounts[i][j];
                ans = Math.max(ans,cnt);
        }
        return ans;
    }
}
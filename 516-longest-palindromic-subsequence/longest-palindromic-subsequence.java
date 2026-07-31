class Solution {
    public int longestPalindromeSubseq(String s) {
        StringBuilder rev = new StringBuilder(s);
        return longestCommonSubsequence(s,rev.reverse().toString());
    }


    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            Arrays.fill(dp[i],-1);
        }
        return recur(m,n,text1,text2,dp);
    }

    public int recur(int i,int j,String text1,String text2,int[][] dp){
        if(i==0 || j==0){
            dp[i][j] = 0;
            return 0;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        if(text1.charAt(i-1)==text2.charAt(j-1)){
            dp[i][j] =  1 + recur(i-1,j-1,text1,text2,dp);
        }else{
            int case1 = recur(i-1,j,text1,text2,dp);
            int case2 = recur(i,j-1,text1,text2,dp);
            dp[i][j] = Math.max(case1,case2);
        }
        return dp[i][j];
    }
}
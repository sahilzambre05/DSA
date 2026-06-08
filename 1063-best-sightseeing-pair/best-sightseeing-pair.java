class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int first = values[0] + 0;
        int ans = Integer.MIN_VALUE;
        for(int j=1;j<values.length;j++){
            int second = values[j]-j;
            ans = Math.max(first+second,ans);
            first = Math.max(first,values[j]+j);
        }
        return ans;
    }
}
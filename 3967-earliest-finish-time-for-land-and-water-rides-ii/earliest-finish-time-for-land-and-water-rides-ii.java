class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int landBestFinish = Integer.MAX_VALUE;
        int waterBestFinish = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;

        for(int i=0;i<landStartTime.length;i++){
            landBestFinish = Math.min(landBestFinish,landStartTime[i]+landDuration[i]);
        }

        for(int i=0;i<waterStartTime.length;i++){
            int curr = Math.max(landBestFinish,waterStartTime[i]) + waterDuration[i];
            ans = Math.min(ans,curr);
        }

        for(int i=0;i<waterStartTime.length;i++){
            waterBestFinish = Math.min(waterBestFinish,waterStartTime[i]+waterDuration[i]);
        }

        for(int i=0;i<landStartTime.length;i++){
            int curr = Math.max(waterBestFinish,landStartTime[i]) + landDuration[i];
            ans = Math.min(ans,curr);
        }
        return ans;
    }
}
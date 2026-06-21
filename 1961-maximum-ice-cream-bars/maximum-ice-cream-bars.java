class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int cnt=0;
        int sum=0;
        for(int i=0;i<costs.length;i++){
            if(costs[i]<coins && (sum+costs[i])<=coins){
                sum+=costs[i];
                cnt++;
            }
        }
        return cnt;
    }
}
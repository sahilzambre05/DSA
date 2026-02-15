class Solution {
    public int maxProfit(int[] prices) {
        int leastp = Integer.MAX_VALUE;
        int pist = 0; //profit if sold today
        int op=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<leastp){
                leastp = prices[i];
            }
            pist = prices[i]-leastp;
            if(pist>op){
                op = pist;
            }
        }
        return op;
    }
}
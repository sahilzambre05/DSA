class Solution {
    public int distributeCandies(int n, int limit) {
        int cnt=0;
        for(int i=0;i<=limit;i++){
            for(int j=0;j<=limit;j++){
                int c = n-i-j;
                if(c>=0 && c<=limit){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
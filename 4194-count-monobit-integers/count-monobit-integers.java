class Solution {
    public int countMonobit(int n) {
        int c = 1;
        int i=1;
        while(i<=n){
            i = (i<<1)|1;
            c++;
        }
        return c;
    }
}
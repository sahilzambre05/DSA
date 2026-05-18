class Solution {
    public int[] countBits(int n) {
        int i=0;
        int[] res = new int[n+1];
        for(int j=0;j<=n;j++){
            int cnt=0;
            String s = Integer.toBinaryString(j);
            for(int k=0;k<s.length();k++){
                if(s.charAt(k)=='1'){
                    cnt++;
                }
            }
            res[i++]=cnt;
        

        }
        return res;
    }
}
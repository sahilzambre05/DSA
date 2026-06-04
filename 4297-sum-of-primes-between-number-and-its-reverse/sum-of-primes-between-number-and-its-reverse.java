class Solution {
    public int sumOfPrimesInRange(int n) {
        String s = String.valueOf(n);
        String rev = new StringBuilder(s).reverse().toString();
        int r = Integer.parseInt(rev);
        int n1 = Math.min(n,r);
        int n2 = Math.max(n,r);
        int cnt=0;
        for(;n1<=n2;n1++){
            boolean bool= true;
            int num = n1;
            if(num<2) continue;
            for(int i=2;i*i<=num;i++){
                if(num%i==0){
                    bool = false;
                    break;
                }
            }
            if(bool){
                cnt+=n1;
            }

        }
        return cnt;
    }
}
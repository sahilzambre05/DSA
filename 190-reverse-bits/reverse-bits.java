class Solution {
    public int reverseBits(int n) {
        String s = Integer.toBinaryString(n);
        while(s.length()<32){
            s = "0" + s;
        }
        String rev = new StringBuilder(s).reverse().toString();
        long ans = Long.parseLong(rev,2);
        return (int) ans;
    }
}
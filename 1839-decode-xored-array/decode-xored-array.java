class Solution {
    public int[] decode(int[] encoded, int first) {
        int decode[] = new int[encoded.length+1];
        decode[0] = first;
        for(int i=0;i<encoded.length;i++){
            decode[i+1] = encoded[i] ^ decode[i];
        }
        return decode;
    }
}
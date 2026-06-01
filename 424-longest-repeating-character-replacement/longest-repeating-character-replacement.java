class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int maxFreq = 0;
        int maxSize = 0;
        int left=0;
        for(int right=0;right<s.length();right++){
            freq[s.charAt(right)-'A']++;
            maxFreq = Math.max(maxFreq,freq[s.charAt(right)-'A']);

            int windowSize = right-left+1;
            if(windowSize-maxFreq>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            windowSize = right-left+1;
            maxSize = Math.max(maxSize,windowSize);
        }
        return maxSize;
    }
}
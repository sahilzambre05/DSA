class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int cnt=0;
        char d = (char)(digit+'0');
        for(int num : nums){
            String a = String.valueOf(num);
            for(int i=0;i<a.length();i++){
                if(a.charAt(i)==d){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
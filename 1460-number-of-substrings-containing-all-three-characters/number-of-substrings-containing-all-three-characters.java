class Solution {
    public int numberOfSubstrings(String s) {
        int left=0,right=0,ans=0;
        int count[] = new int[3];
        int n = s.length();

        while(right<n){
            count[s.charAt(right)-'a']++;

            while(isValid(count)){
                ans+=(n-right);
                count[s.charAt(left)-'a']--;
                left++;
            }
            right++;
        }
        return ans;
    }

    public boolean isValid(int[] count){
        if(count[0]>0 && count[1]>0 && count[2]>0) return true;
        return false;
    }
}
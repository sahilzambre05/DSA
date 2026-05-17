class Solution {
    public int countKeyChanges(String s) {
        s=s.toLowerCase();
        int cnt=0;
        // HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                cnt++;
            }
        }
        return cnt;
    }
}
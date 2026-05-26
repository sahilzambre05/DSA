class Solution {
    public int balancedStringSplit(String s) {
       int r=0;
       int l=0;
       int cnt=0;
       for(char a : s.toCharArray()){
        if(a=='R') r++;
        if(a=='L') l++;
        if(r==l){
            cnt++;
        }
       }
       return cnt; 
    }
}
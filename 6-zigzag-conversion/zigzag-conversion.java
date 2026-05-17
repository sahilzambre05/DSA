class Solution {
    public String convert(String s, int numRows) {
        String[] res = new String[numRows];
        int i=0;
        Arrays.fill(res,"");
        while(i<s.length()){
            for(int idx=0;idx<numRows && i<s.length();idx++){
                res[idx]+=s.charAt(i++);
                
            }
            for(int idx=numRows-2;idx>0 && i<s.length();idx--){
                res[idx]+=s.charAt(i++);
                
            }

        }
        String ans = "";
        for(String str : res){
            ans+=str;
        }
        return ans;
    }
}
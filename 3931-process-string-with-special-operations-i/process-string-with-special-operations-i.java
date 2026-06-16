class Solution {
    public String processStr(String s) {
        String res = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                res+=res;
            }else if(s.charAt(i)=='%'){
                String rev = new StringBuilder(res).reverse().toString();
                res=rev;
            }else if(s.charAt(i)=='*'){
                res = (!res.isEmpty()) ? res.substring(0, res.length() - 1) : "";
            }else{
                res+=s.charAt(i);
            }
        }
        return res;
        
    }
}
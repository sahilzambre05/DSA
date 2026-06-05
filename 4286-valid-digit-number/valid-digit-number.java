class Solution {
    public boolean validDigit(int n, int x) {
        String s = String.valueOf(n);
        char a = (char)(x + '0');
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==a && s.charAt(0)!=a){
                return true;
            }
        }
        return false;
    }
}
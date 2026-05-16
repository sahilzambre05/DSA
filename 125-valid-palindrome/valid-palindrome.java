class Solution {
    public boolean isPalindrome(String s) {
        String a = "";
        s = s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char n = s.charAt(i);
            if(Character.isLetterOrDigit(n)){
                a+=n;
            }
        }

        String rev = new StringBuilder(a).reverse().toString();
        if(rev.equals(a)){
            return true;
        }
        return false;
    }
}
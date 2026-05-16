class Solution {
    public boolean isPalindrome(String s) {
        String a = "";
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        // for(int i=0;i<s.length();i++){
        //     char n = s.charAt(i);
        //     if(Character.isLetterOrDigit(n)){
        //         a+=n;
        //     }
        // }

        String rev = new StringBuilder(s).reverse().toString();
        if(rev.equals(s)){
            return true;
        }
        return false;
    }
}
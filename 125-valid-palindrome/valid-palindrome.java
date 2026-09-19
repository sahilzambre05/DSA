class Solution {
    public boolean isPalindrome(String s) {
        String a = s.toLowerCase();
        String str = "";
        for(char c : a.toCharArray()){
            if(Character.isLetter(c) || Character.isDigit(c)){
                str+=c;
            }
        }

        String rev = new StringBuilder(str).reverse().toString();
        System.out.println(rev);
        System.out.print(str);
        return rev.equals(str);
    }
}
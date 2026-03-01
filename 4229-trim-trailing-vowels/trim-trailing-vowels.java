class Solution {
    public String trimTrailingVowels(String s) {
        int i=s.length()-1;
        while(i>=0 && isVowel(s.charAt(i))){
            i--;
        }
        if(i<0) return "";

        return s.substring(0,i+1);
    }

    public boolean isVowel(char a){
        if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u'){
            return true;
        }
        return false;
    }
}
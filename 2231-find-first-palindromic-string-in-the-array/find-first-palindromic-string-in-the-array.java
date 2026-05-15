class Solution {
    public String firstPalindrome(String[] words) {
        for(String word : words){
            int i=0;
            int j = word.length()-1;
            boolean t = true;;
            while(i<=j){
                if(word.charAt(i)!=word.charAt(j)){
                    t = false;
                    break;
                }
                i++;
                j--;
                
            }
            if(t==true){
                return word;
            }
        }
        return "";
    }
}
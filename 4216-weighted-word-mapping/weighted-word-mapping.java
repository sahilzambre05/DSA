class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String s = "";
        for(String word : words){
            int sum=0;
            for(int i=0;i<word.length();i++){
                sum+=weights[word.charAt(i)-'a'];
            }
            int mod = sum%26;
            char ch =(char) ('z' - mod);
            s+=ch;
        }
        return s;
    }
}
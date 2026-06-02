class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a="";
        String b="";
        for(String c : word1){
            a+=c;
        }
        for(String d : word2){
            b+=d;
        }
        if(a.equals(b)){
            return true;
        }
        return false;
    }
}
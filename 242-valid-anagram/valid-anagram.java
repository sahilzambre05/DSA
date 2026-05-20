class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int i=0;
        int j=0;
        char[] A = s.toCharArray();
        char[] B = t.toCharArray();
        Arrays.sort(A);
        Arrays.sort(B);

        int len = s.length();
        while(i<len && j<len){
            if(A[i]!=B[j]){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}
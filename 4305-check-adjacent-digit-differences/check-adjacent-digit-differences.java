class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        char[] a = s.toCharArray();
        for(int i=0;i<a.length-1;i++){
            int n1 = a[i] - '0';
            int n2 = a[i+1] - '0';
            if(Math.abs(n1-n2)>2){
                return false;
            }
            
        }
        return true;
    }
}
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder S = new StringBuilder();
        int open=0;
        for(char c : s.toCharArray()){
            if(c=='(' &&  open++ > 0) S.append(c);
            if(c==')' &&  open-- > 1) S.append(c);
        }
        return S.toString();
    }
}
class Solution {
    public String smallestSubsequence(String s) {
        int[] lastIndex = new int[26];
        for(int i=0;i<s.length();i++){
            lastIndex[s.charAt(i)-'a'] = i;
        }
        boolean[] bool = new boolean[26];
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            int c = s.charAt(i) - 'a';
            if(bool[c]) continue;
            while(!stack.isEmpty() && stack.peek()>c && i<lastIndex[stack.peek()]){
                bool[stack.pop()] = false;
            }
            stack.push(c);
            bool[c] = true;
        }

        StringBuilder res = new StringBuilder();
        while(!stack.isEmpty()){
            res.append((char)(stack.pop()+'a'));
        }
        return res.reverse().toString();
    }
}
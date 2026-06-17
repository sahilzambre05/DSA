class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char ch = s.charAt(i);
            if(!stack.isEmpty() && stack.peek()==ch){
                stack.pop();
            }else{
                stack.push(ch);
            }

        }
        String res = "";

        while(!stack.isEmpty()){
            res+=stack.pop();
        }

        String ans = new  StringBuilder(res).reverse().toString();
        return ans;
    }
}
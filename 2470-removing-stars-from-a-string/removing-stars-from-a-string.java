class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(stack.isEmpty() && ch!='*'){
                stack.push(ch);
            }else{
                if(ch=='*'){
                    stack.pop();
                }else{
                    stack.push(ch);
                }
            }
        }

        String ans = "";
        while(!stack.isEmpty()){
            ans+=stack.pop();
        }

        String rev = new StringBuilder(ans).reverse().toString();
        return rev;
    }
}
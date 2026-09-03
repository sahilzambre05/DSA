class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for(char a : s.toCharArray()){
            if(a=='(' || a=='{' || a=='['){
                stack.push(a);
            }else{
                if(!stack.isEmpty()){
                    if(stack.peek()=='(' && a==')'){
                        stack.pop();
                    }
                    else if(stack.peek()=='{' && a=='}'){
                        stack.pop();
                    }
                    else if(stack.peek()=='[' && a==']'){
                        stack.pop();
                    }else{
                        stack.push(a);
                    }
                }else{
                    return false;
                }
            }
        }
        return (stack.isEmpty());
    }
}
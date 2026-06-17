class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(stack.size()>=2){
                if(tokens[i].equals("+")){
                    int val2 = stack.pop();
                    int val1 = stack.pop();
                    stack.push(val1+val2);

                }else if(tokens[i].equals("-")){
                    int val2 = stack.pop();
                    int val1 = stack.pop();
                    stack.push(val1-val2);
                    
                }else if(tokens[i].equals("*")){
                    int val2 = stack.pop();
                    int val1 = stack.pop();
                    stack.push(val1*val2);
                    
                }else if(tokens[i].equals("/")){
                    int val2 = stack.pop();
                    int val1 = stack.pop();
                    stack.push(val1/val2);
                    

                }else{
                    int val = Integer.parseInt(tokens[i]);
                    stack.push(val);
                }
            }else{
                int val = Integer.parseInt(tokens[i]);
                stack.push(val);
            }
        }

        return stack.pop();
    }
}
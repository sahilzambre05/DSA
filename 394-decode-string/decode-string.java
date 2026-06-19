class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();

        int num = 0;
        String s1 = "";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='0' && c<='9'){
                num = num*10 + c-'0';

            }else if(c=='['){
                strStack.push(s1);
                numStack.push(num);
                s1="";
                num=0;

            }else if(c==']'){
                String s2 = strStack.pop();
                int n = numStack.pop();

                StringBuilder str = new StringBuilder();
                str.append(s2);
                for(int j=0;j<n;j++){
                    str.append(s1);
                }
                s1 = str.toString();
                
            }else{
                s1 += c;
            }
        }

        return s1;

    }
}
class Solution {
    public String trimTrailingVowels(String s) {
        int i=s.length()-1;
        while(i>=0 && isVowel(s.charAt(i))){
            i--;
        }
        if(i<0) return "";

        return s.substring(0,i+1);
    }

    public boolean isVowel(char a){
        if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u'){
            return true;
        }
        return false;
    }
}

// class Solution{
//     public String trimTrailingVowels(String s){
//         Stack<Character> stack = new Stack<>();
//         StringBuilder ans =  new StringBuilder();
//         for(int i=0;i<s.length();i++){
//             stack.push(s.charAt(i));
//         }

        

//         while(stack.peek()=='a' || stack.peek()=='e' ||stack.peek()=='i' ||stack.peek()=='o' ||stack.peek()=='u'){
//             stack.pop();
//             if(stack.isEmpty()){
//                 return "";
//             }
//         }

//         while(!stack.isEmpty()){
//             ans.append(stack.pop());
//         }

//         String res = ans.reverse().toString();
//         return res;
//     }
// }
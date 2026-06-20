class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generate(res,"",n,n);
        return res;
    }

    public void generate(List<String> res, String s,int left,int right){
        if(left==0 && right==0){
            res.add(s);
            return;
        }
        if(left>0){
            generate(res,s+"(",left-1,right);
        }
        if(right>left){
            generate(res,s+")",left,right-1);

        }
    }
}
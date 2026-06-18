class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[heights.length];
        for(int i=heights.length-1;i>=0;i--){
            int count=0;
            while(!stack.isEmpty() && stack.peek()<heights[i]){
                stack.pop();
                count++;
            }

            if(!stack.isEmpty()){
                count++;
            }

            ans[i] = count;

            stack.push(heights[i]);
        }
        return ans;
    }
}
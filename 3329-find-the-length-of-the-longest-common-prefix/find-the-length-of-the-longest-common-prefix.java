class Solution {
    public int length(int x){
        int cnt=0;
        while(x>0){
            cnt++;
            x/=10;
        }
        return cnt;
    }
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr1){
            int x = num;
            while(x>0){
                set.add(x);
                x=x/10;
            }
        }

        int max = 0;
        for(int num : arr2){
            int x = num;
            int len = length(num);
            while(x>0){
                if(set.contains(x)){
                    max = Math.max(max,len);
                    break;
                }
                x/=10;
                len--;
            }
        }
        return max;
    }
}
class Solution {
    public int sumBase(int n, int k) {
        return Integer.toString(n, k).chars().map(c -> c - '0').sum();
    }
}
class Solution {
    public boolean isDigitorialPermutation(int n) {
        int[] fact = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};

        int sum = 0;
        int temp = n;

        while (temp > 0) {
            sum += fact[temp % 10];
            temp /= 10;
        }

        char[] a = String.valueOf(n).toCharArray();
        char[] b = String.valueOf(sum).toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}
class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int xor = 0;
        int zero = 0;
        for (int x : nums) {
            xor ^= x;
            if (x == 0) {
                zero++;
            }
        }
        if (xor != 0) {
            return n;
        }
        if (zero == n) {
            return 0;
        }
        return n - 1;
    }
}

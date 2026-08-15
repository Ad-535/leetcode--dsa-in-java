class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0;   
        for (int i : nums) {
            xor ^= i;
        }
        if (xor != 0)
            return nums.length;
        for (int i : nums) {
            if (i != 0)
                return nums.length - 1;
        }
        return 0;
    }
}
class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {

        int max = 0;
        for (int x : nums)
            max = Math.max(max, x);

        int[] freq = new int[max + 1];

        for (int x : nums)
            freq[x]++;

        long[] gcdCount = new long[max + 1];

        for (int g = max; g >= 1; g--) {

            long cnt = 0;

            for (int multiple = g; multiple <= max; multiple += g) {
                cnt += freq[multiple];
                gcdCount[g] -= gcdCount[multiple];
            }

            gcdCount[g] += cnt * (cnt - 1) / 2;
        }

        for (int i = 2; i <= max; i++)
            gcdCount[i] += gcdCount[i - 1];

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            ans[i] = upperBound(gcdCount, queries[i]);
        }

        return ans;
    }

    private int upperBound(long[] arr, long target) {
        int left = 1;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > target)
                right = mid;
            else
                left = mid + 1;
        }

        return left;
    }
}
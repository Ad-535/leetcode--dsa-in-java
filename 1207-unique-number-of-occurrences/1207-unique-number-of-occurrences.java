class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int[] freq = new int[map.size()];
        int i = 0;
        for (int count : map.values()) {
            freq[i++] = count;
        }
        Arrays.sort(freq);
        for (i = 1; i < freq.length; i++) {
            if (freq[i] == freq[i - 1]) {
                return false;
            }
        }

        return true;
    }
}
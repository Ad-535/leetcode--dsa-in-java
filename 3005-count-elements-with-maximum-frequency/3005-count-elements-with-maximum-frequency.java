class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            int c = map.getOrDefault(i,0);
            map.put(i,c+1);
        }
          int maxFreq = 0;
        for (int k : map.keySet()) {
            maxFreq = Math.max(maxFreq, map.get(k));
        }
        int ans = 0;
        for (int k : map.keySet()) {
            if (map.get(k) == maxFreq) {
                ans += map.get(k);
            }
        }
        return ans;
    }
}
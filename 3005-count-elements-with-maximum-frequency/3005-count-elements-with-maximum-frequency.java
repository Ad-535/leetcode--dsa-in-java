class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            int c = map.getOrDefault(i,0);
            map.put(i,c+1);
        }
        int freq = 0;
        for(int k:map.values()){
            freq = Math.max(freq,k);
        }
        int ans = 0;
        for(int k:map.values()){
            if(k==freq){
                ans+=k;
            }
        }
        return ans;
    }
}
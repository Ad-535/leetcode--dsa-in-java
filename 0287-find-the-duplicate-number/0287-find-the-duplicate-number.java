class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            int c = map.getOrDefault(i,0);
            map.put(i,c+1);
        }
        for(int k : map.keySet()){
            int f = map.get(k);
            if(f>1)
            return k;
        }
        return -1;
    }
}
class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums){
            if(i%k==0){
                set.add(i);
            }
        }
        int x = k;
        while(set.contains(x)){
            x+=k;
        }
        return x;
    }
}
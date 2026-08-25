class Solution {
    public int missingMultiple(int[] nums, int k) {
        int x = k;
        int ans = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums){
            if(i%k==0){
                set.add(i);
            }
        }
        while(set.contains(x)){
            x+=k;
        }
        return x;

    }
}
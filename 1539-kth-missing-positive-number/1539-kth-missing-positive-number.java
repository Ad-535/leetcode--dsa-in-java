class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();
        int res[] = new int[k];
        int j = 0;
        for(int i:arr)
        set.add(i);
        for(int i=1;i<=arr.length+k;i++){
            if(!set.contains(i)){
                res[j] = i;
                j++;
                if(j==k)
                break;
            }
        }
         return res[k-1];
    }
}
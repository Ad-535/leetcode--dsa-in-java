class Solution {
    public int findKthPositive(int[] arr, int k) {
       int res[] = new int[k];
       int j = 0;
       HashSet<Integer> ans = new HashSet<>();
       for(int i:arr)
       ans.add(i);
       for(int i=1;i<=arr.length+k;i++){
        if(!ans.contains(i)){
          res[j] = i;
          j++;
          if (j == k){
           break;
           }
        }
       }
         return res[k-1];
    }
}
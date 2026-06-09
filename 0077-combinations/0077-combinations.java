class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> nums=new ArrayList<>();
        for(int i=1;i<=n;i++)nums.add(i);
        List<List<Integer>> ans =new ArrayList<>();
        fun(nums,ans,new ArrayList<>(),k,0);
        return ans;
    }
    void fun(List<Integer> nums, List<List<Integer>> ans, List<Integer> c, int k, int idx){
        if(c.size()==k){
            ans.add(new ArrayList<>(c));
            return;
        }
        if(idx==nums.size())return ;
        fun(nums,ans,c,k,idx+1);

        c.add(nums.get(idx));
        fun(nums,ans,c,k,idx+1);
        c.remove(c.size()-1);

    }
}
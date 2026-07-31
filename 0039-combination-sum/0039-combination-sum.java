class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        helper(0, candidates, target, new ArrayList<>());
        return ans;
    }

    public void helper(int index, int[] arr, int target, List<Integer> list) {

        // Base case
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        if (index == arr.length || target < 0) {
            return;
        }

        // Take
        list.add(arr[index]);
        helper(index, arr, target - arr[index], list);
        list.remove(list.size() - 1);

        // Don't Take
        helper(index + 1, arr, target, list);
    }
}
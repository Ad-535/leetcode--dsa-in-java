class Solution {
    public int sumOfUnique(int[] nums) {
        HashSet<Integer> unique = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();
        for(int i : nums) {
            if(unique.contains(i)) {
                unique.remove(i);
                duplicate.add(i);
            }
            else if(!duplicate.contains(i)) {
                unique.add(i);
            }
        }

        int sum = 0;

        for(int i : unique) {
            sum += i;
        }

        return sum;
    }
}
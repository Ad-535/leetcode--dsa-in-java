class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            int count = map.getOrDefault(ch, 0);
            map.put(ch, count + 1);
            if (map.get(ch) == 2) {
                return ch;
            }
        }
        return ' ';
    }
}
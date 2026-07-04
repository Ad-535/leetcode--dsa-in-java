class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> a = new HashSet<>();
        for(int i='a';i<='z';i++){
            a.add((char)i);
        }
        for(int i=0;i<sentence.length();i++){
            a.remove(sentence.charAt(i));
            if(a.isEmpty())
            return true;
        }
        return false;
    }
}
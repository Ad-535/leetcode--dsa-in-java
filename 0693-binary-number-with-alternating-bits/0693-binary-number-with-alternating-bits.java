class Solution {
    public boolean hasAlternatingBits(int n) {
        String binary =Integer.toBinaryString(n);
        if(binary.contains("00") || binary.contains("11"))return false;
        return true;
        
    } 
}
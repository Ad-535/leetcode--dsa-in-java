class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int prod = 1;
        int total = 0;
        int x = n;
        int rev = 0;
        while(x>0){
        rev = x%10;
        x=x/10;
        sum+=rev;
        prod*=rev;
        }
         total = sum+prod;
        if(n%total==0)
        return true;
        else
        return false; 
    }
}
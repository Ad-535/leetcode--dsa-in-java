class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=n+t;i++){
            int temp = i;
            int k = 1;
            while(temp>0){
                 int digit=temp%10;
                k *=digit;
                temp = temp/10;
            }
              if(k%t==0)
              return i;
        }
           return -1;
    }
}
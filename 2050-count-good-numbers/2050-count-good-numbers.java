class Solution {
    private static final int mod = 1000000007;
    public int countGoodNumbers(long n) {
        long evenCount = (n + 1)/2;
        long oddCount = n/2;

        long ans =  (power(5 , evenCount) * power(4 , oddCount)) % mod;
        return (int)ans;
        
    }

    private long power(long base , long exp){
        long res = 1;
        base %= mod;

        while(exp > 0){
            if((exp & 1) == 1){
                res = (res * base) % mod;   
            }
            base = (base * base) % mod;
            exp >>= 1;
        }
        return res;
    }
}
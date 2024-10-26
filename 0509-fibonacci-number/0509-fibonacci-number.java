class Solution {
    public int fib(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
      return  fibhelper(n,dp);
    }
    public int fibhelper(int n, int[] dp)
    {
        if(n==1 || n==0)
        return n;
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        int temp = fibhelper(n-1,dp);
        int temp1 = fibhelper(n-2,dp);
        dp[n] = temp + temp1;
        return temp + temp1;
    } 
}
class Solution {
    public int addDigits(int num) {
        int result=sum(num);
        return result;
       
    }
    public static int sum(int num)
    {
       int ans=0;
        while(num!=0)
        {
            int l=num%10;
            ans=ans+l;
            num=num/10;
        }
        if(ans>9)
        {
         ans= sum(ans);
        }
      return ans;
    }
}
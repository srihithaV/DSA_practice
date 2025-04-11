class Solution {
    public int subarrayGCD(int[] nums, int k) {
       int count=0;
       int n= nums.length;
       for(int i=0;i<n;i++)
       {int ans=0;
        for(int j=i;j<n;j++)
        {
            ans=gcd(ans,nums[j]);
            if(ans==k)
            count++;
            if(ans<k)
            break;
        }
       }
       return count; 
    }
    public static int gcd(int a, int b)
    {
        if(a==0)
        return b;
        int temp=gcd(b%a,a);
        return temp;
    }
}
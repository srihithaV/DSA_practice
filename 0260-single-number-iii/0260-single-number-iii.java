class Solution {
    public int[] singleNumber(int[] nums) {
        int s[]=new int[2];
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            ans=ans^nums[i];
        }
        int idx=0;
        for(int i=0;i<32;i++)
        {
            if((ans & (1<<i))!=0)
            {
                  idx=i;
                  break;
            }
        }
        int s1=0;
        int s2=0;
        for(int i=0;i<nums.length;i++)
        {
            if((nums[i] & (1<<idx))!=0)
            {
                s1=s1^nums[i];
            }
            else
            s2=s2^nums[i];
        }
        s[0]=s1;
        s[1]=s2;
        return s;
        
    }
}
class Solution {
    public int[] findErrorNums(int[] nums) {
        int ans[]=new int[2];
        int n=nums.length;
        int freq[]=new int[n+1];
        for(int val: nums)
        {
            freq[val]++;
        }
        for(int i=1;i<freq.length;i++)
        {
            if(freq[i]==2)
               ans[0]=i;
            if(freq[i]==0)
                 ans[1]=i;
         }
    return ans;
    }
}
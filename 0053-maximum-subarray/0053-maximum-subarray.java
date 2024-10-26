class Solution {
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int sum =0;
        // using kadans algorithm..
        for(int i=0;i<nums.length;i++)
        {
            if(sum >= 0)
            {
               sum = sum + nums[i];
            }
        else
        {
            sum = nums[i];
        }
            
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}

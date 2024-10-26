class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int ans = 0;
        int lgei = 0;
        int lastvalidcount = 0;
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i] > right)
           {
               lastvalidcount = 0;
               lgei = i +1;
           } 
           else if(nums[i] >= left && nums[i] <=right)
           {
               ans = ans + i - lgei + 1;
               
               lastvalidcount =  i - lgei + 1;
           }
           else
           {
               ans = ans + lastvalidcount;
           }
        }
        return ans;
         
    }
}
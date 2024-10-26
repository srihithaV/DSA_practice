class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int  max=nums[nums.length-1];
        int j=1;
        int index=nums.length-1;
       int i=nums.length-2;
       while(j!=k && i>=0)
       {
           if(nums[i]<=max)
           {
               max=nums[i];
               j++;
           }
           if(j==k)
           {
               index=i;
               break;
             }
           i--;
       }
        return nums[index];
    }
}
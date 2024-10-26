class Solution {
    
    public void nextPermutation(int[] nums) {
        int n=nums.length;
       int i = n-2;
        while(i>=0 && nums[i]>= nums[i+1])
        {
            i--;
        }
        if(i>=0)
        {
            int j = n-1;
            while(j>=0 && nums[j]<=nums[i])
            {
                j--;
            }
            //swapping
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            
               }
         reverse(i+1,nums);

    }
    public void reverse(int st, int[] nums)
        {
            int end = nums.length-1;
            while(st<end)
            {
                int temp = nums[st];
                nums[st]=nums[end];
                nums[end]=temp;
                st++;
                end--;
            }
        }
       
}
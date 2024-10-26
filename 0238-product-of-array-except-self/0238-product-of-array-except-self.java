class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int suffix=1;
        int[] ppro = new int[n];
         ppro[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            ppro[i]=ppro[i-1]*nums[i];
        }
        
        for(int i=n-1;i>0;i--)
        {
            ppro[i]=ppro[i-1]*suffix;
            suffix=suffix* nums[i];
        }
        ppro[0]=suffix;
        return ppro;
    }
}
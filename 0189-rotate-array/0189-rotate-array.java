class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        revfun(nums,0,n-1);
        revfun(nums,k,n-1);
        revfun(nums,0,k-1);
    }
    public static void revfun(int nums[],int s,int e)
    {
        while(s<e)
        {
            int temp = nums[e];
            nums[e] = nums[s];
            nums[s] = temp;
            s++;
            e--;
        }
    }
}
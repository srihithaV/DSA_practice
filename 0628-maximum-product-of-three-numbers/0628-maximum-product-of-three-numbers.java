class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;                        // take an array, sort the elements and try this logic
        int p=nums[n-1]*nums[n-2]*nums[n-3];   // the answer will definitely be either p or q
        int q=nums[0]*nums[1]*nums[n-1];
        int ans = Math.max(p,q);
        return ans;
        
    }
}
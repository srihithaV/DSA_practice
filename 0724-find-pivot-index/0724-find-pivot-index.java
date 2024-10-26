class Solution {
    public int pivotIndex(int[] nums) {
   int n=nums.length;
        
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int idx = -1;
        int currSum = 0;

        for (int i = 0; i < n; i++) {
            if (currSum == totalSum - currSum - nums[i]) {
                idx = i;
                break;
            }
            currSum += nums[i];
        }
        return idx;
    }
}



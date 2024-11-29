class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int slow=nums[0];
        int high=nums[0];
        do{
            slow=nums[slow];
            high=nums[nums[high]];
        }while(slow!=high);
        slow=nums[0];
        while(slow!=high)
        {
            slow = nums[slow];
            high=nums[high];
        }
        return slow;
        
    }
}
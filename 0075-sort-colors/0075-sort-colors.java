class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low=0;
        int high=n-1;
        int mid=0;
        while(mid<=high)
        {                                              //Logic
            if(nums[mid]==0)                // mid starts from 0, low =0, high=n-1
            {                             // low will store zeroes(left) and high will store two's(right)
                int temp=nums[mid];       // mid travels from low to <=high
                nums[mid]=nums[low];  //if mid==0, swaps with low pointer index value and increments the low & mid 
                nums[low]=temp;       //if mid==1, then skip it(mid++)
                mid++;                  // if mid==2, swap it with high index value and decreemnt the high pointer
                low++;
            }
            else if(nums[mid]==1)
            {
                mid++;
            }
            else{
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
    }
}
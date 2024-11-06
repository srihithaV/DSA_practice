class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n= nums.length;
        int psum[]=new int[n];
        psum[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            psum[i]=psum[i-1]+nums[i];
        }
        int ans=0;
        hm.put(0,1);
        for(int ep=0;ep<n;ep++)
        {
            int diff=psum[ep]-k;
            ans=ans+hm.getOrDefault(diff,0);
            hm.put(psum[ep],hm.getOrDefault(psum[ep],0)+1);
        }
        return ans;
        
    }
}
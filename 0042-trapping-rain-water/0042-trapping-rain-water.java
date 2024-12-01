class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int pmax[]=new int[n];
        int smax[]=new int[n];
        int store=0;
        pmax[0]=height[0];
        for(int i=1;i<n;i++)
        {
            pmax[i]=Math.max(pmax[i-1],height[i]);
        }
        smax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            smax[i]=Math.max(height[i],smax[i+1]);
        }
        for(int i=1;i<n;i++)
        {
            store=store+Math.min(pmax[i],smax[i])-height[i];
        }
        return store;
    }
    
}
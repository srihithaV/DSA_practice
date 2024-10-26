class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int count=0;
        int pmax[] = prefix(height,n);
        int smax[]=  suffix(height,n);
        for(int i=1;i<n-1;i++)
        {
            int lb=pmax[i-1];
            int rb=smax[i+1];
            int yb=Math.min(lb,rb);
            int contri = yb-height[i];
            if(contri >0)
            {
                count=count+contri;
            }
        }
        
       return count; 
    }
    public int[] prefix(int height[],int n)
    {
        int[] pmax = new int[n];
        pmax[0]=height[0];
        for(int i=1;i<n;i++)
        {
            pmax[i]=Math.max(pmax[i-1],height[i]);
        }
        return pmax;
    }
     public int[] suffix(int height[],int n)
    {
        int[] smax = new int[n];
        smax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            smax[i]=Math.max(smax[i+1],height[i]);
        }
        return smax;
    }
    
}
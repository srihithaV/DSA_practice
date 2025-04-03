class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n=arr.length;
        int pf[]=new int[n];
        pf[0]=arr[0];
        for(int i=1;i<n;i++)
        {
          pf[i]=Math.max(pf[i-1],arr[i]);
        }
        int sf[]=new int[n];
        sf[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            sf[i]=Math.min(sf[i+1],arr[i]);
        }
        int ans=0;
        for(int i=0;i<n-1;i++)
        {
          if(pf[i]<=sf[i+1])
          ans++;
        }
        ans++;
      return ans;
    }
}
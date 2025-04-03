class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n= arr.length;
        int maxi=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<n;i++)
        {
            maxi=Math.max(maxi,arr[i]);
            if(maxi==i)
            {
                count++;
            }
        }
        return count;
    }
}
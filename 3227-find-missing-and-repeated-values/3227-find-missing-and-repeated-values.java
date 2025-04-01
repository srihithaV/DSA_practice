class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int size=grid.length;
        int freq[]=new int[size*size+1];
        int res[]=new int[2];
        for(int row[]:grid)
        {
            for(int val:row)
            {
                freq[val]++;
            }
        }
        for(int i=1;i<freq.length;i++)
        {
            if(freq[i]==2)
            res[0]=i;
            else if(freq[i]==0)
            res[1]=i;
        }
        return res;
    }
}
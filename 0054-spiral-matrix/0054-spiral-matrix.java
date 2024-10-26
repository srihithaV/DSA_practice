
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int i = 0;
        int j = 0;
        int rsteps = n-1;
        int csteps = m-1;
        while(rsteps > 0 && csteps > 0)
        {
            for(int k=0;k<csteps;k++)
            {
                ans.add(matrix[i][j]);
                j++;
            }
            for(int k=0;k<rsteps;k++)
            {
                ans.add(matrix[i][j]);
                i++;
            }
            for(int k=csteps;k>=1;k--)
            {
                 ans.add(matrix[i][j]);
                 j--;
            }
            for(int k=rsteps;k>=1;k--)
            {
                ans.add(matrix[i][j]);
                i--;
            }
            rsteps = rsteps - 2;
            csteps = csteps - 2;
            i++;
            j++;
        }
        if(rsteps == 0)
        {
            for(int k=0;k<csteps+1;k++)
            {
                ans.add(matrix[i][j]);
                j++;
            }
        }
       else  if(csteps==0)
        {
             for(int k=0;k<rsteps+1;k++)
             {
                 ans.add(matrix[i][j]);
                 i++;
             }
        }
        return ans;
        
    }
}
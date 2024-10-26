class Solution {
    public void rotate(int[][] matrix) {
          int n = matrix.length;  
        int m = matrix[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
              int temp = matrix[i][j];
              matrix[i][j] = matrix[j][i];
              matrix[j][i] = temp; 
            }
        }
        for(int i=0;i<n;i++)
        {
            int temp[] = matrix[i];
           int sp =0;
           int ep = temp.length-1;
           while(sp < ep)
           {
               int shift = temp[sp];
               temp[sp]= temp[ep];
               temp[ep] = shift;
               sp++;
               ep--;
           }
           matrix[i] = temp;
        }
        
    }
}
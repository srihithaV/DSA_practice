class Solution {
  static class Pair{
		int row;
		int col ; 
		int time;
		Pair(int row, int col, int time){
			this.row = row;
			this.col = col;
			this.time = time;
    }
  }
   public int orangesRotting(int[][] grid) {
int m = grid.length;
        int n = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        int count1=0;
        int count2 =0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==2)
                {
                    q.add(new Pair(i,j,0));
                    count2++;                 
                }
                else if(grid[i][j]==1)
                count1++;
            }
        }
        if(count1==0)
        {
        return 0;
        }
        if(count2==0){
        return -1;}
      int ans=-1;
      while(q.size()>0)
      {
          Pair rem = q.remove();
          int crow = rem.row;
          int ccol = rem.col;
          int ctime = rem.time;
          ans = ctime;
          if(crow-1>=0 && grid[crow-1][ccol]==1)
          {
              q.add(new Pair(crow-1,ccol,ctime+1));
              grid[crow-1][ccol]=2;
          }
          if(ccol-1>=0 && grid[crow][ccol-1]==1)
          {
              q.add(new Pair(crow,ccol-1,ctime+1));
              grid[crow][ccol-1]=2;
          }
          if(crow+1 <m && grid[crow+1][ccol]==1)
          {
              q.add(new Pair(crow+1,ccol,ctime+1));
              grid[crow+1][ccol]=2;
          }
          if(ccol+1 <n && grid[crow][ccol+1]==1)
          {
              q.add(new Pair(crow,ccol+1,ctime+1));
              grid[crow][ccol+1]=2;
          }

      }
      for(int i=0;i<m;i++)
      {
          for(int j=0;j<n;j++)
          {
              if(grid[i][j]==1)
              {
                  return -1;
              }
          }
      }

     return ans;
        
    }
}
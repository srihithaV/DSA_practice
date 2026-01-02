class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
       Collections.sort(processorTime);
       Collections.sort(tasks);
       int n= tasks.size();
       int j=n-1;
       int ans=0;
       for(int i=0;i<processorTime.size();i++)
       {
         int c=0;
         while(c<4 && j>=0)
         {
            ans=Math.max(ans,processorTime.get(i)+tasks.get(j));
            j--;
            c++;
         }
       } 
       return ans;
    }
}
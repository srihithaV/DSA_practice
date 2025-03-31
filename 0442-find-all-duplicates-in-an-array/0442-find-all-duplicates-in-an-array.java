class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       int freq[]=new int[nums.length+1];
       ArrayList<Integer> al=new ArrayList<>();
       for(int i:nums)
       {
        freq[i]++;
       } 
       for(int j=1;j<freq.length;j++)
       {
         if(freq[j]>1)
         al.add(j);
       }
       return al;
    }
}
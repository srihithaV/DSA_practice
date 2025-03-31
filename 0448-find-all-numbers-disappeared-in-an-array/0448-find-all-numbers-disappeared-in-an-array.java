class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int freq[]=new int[nums.length+1];
        ArrayList<Integer> al=new ArrayList<>();
        for(int i:nums)
        {
            freq[i]++;
        }
        for(int i=1;i<freq.length;i++)
        {
            if(freq[i]==0)
            al.add(i);
        }
          return al;
    }
}
class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num: nums)
        {
            if(hm.containsKey(num)==true)
            {
                int temp=hm.get(num);
                hm.put(num,temp+1);
            }
            else
            {
                hm.put(num,1);
            }
        }
        
        for(int num: nums)
        {
            if(hm.get(num)>1)
                return true;
              
        }
        return false;
    }
    
}
            


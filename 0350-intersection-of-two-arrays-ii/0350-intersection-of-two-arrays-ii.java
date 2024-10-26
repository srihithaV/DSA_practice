class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = nums1.length;
        int m = nums2.length; 
     HashMap<Integer,Integer> hm = new HashMap<>();
       for(int s: nums1)
           {
     if(hm.containsKey(s)== true)
         {
         int temp = hm.get(s);
        hm.put(s,temp+1);
        }
          else
              {
              hm.put(s,1);
          }
       }
       for(int z: nums2)
           {
   if(hm.containsKey(z) == true)
       {
       if(hm.get(z) >=1)
           {
       ans.add(z);
          int p = hm.get(z);
          hm.put(z,p-1);
       }
   }
       }
        int s = ans.size();
        int arr[] = new int[s];
        int k=0;
        for(int j: ans)
            {
           arr[k] = j;
           k++;
        }
        
       return arr;
    }
}
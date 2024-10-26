class Solution {
    public boolean isAnagram(String s, String t) {
char[] word = s.toCharArray();
  HashMap<Character,Integer> hm = new HashMap<>();
 for(int i=0;i<word.length;i++)
     {
     if(hm.containsKey(word[i])==true)
        {
    int temp= hm.get(word[i]);
    hm.put(word[i],temp+1);
        }
        else
        {
            hm.put(word[i],1);
        }
 }
char[] res = t.toCharArray();
    for(int j=0;j<res.length;j++)
      {
     if(hm.containsKey(res[j])==true)
         {
      int temp2 = hm.get(res[j]);
        hm.put(res[j],temp2-1);
         if(hm.get(res[j])==0)
             hm.remove(res[j]);
     }
          else{
            return false;
          }
      }
    
        
     boolean r =hm.isEmpty(); 
       // System.out.print(r);
       return r;
    }
}
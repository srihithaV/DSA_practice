class Solution {
    public int firstUniqChar(String s) {
        char[] letters = s.toCharArray();
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<letters.length;i++)
        {
            if(hm.containsKey(letters[i])==true)
            {
                int temp = hm.get(letters[i]);
                hm.put(letters[i],temp+1);
            }
            else
            {
                hm.put(letters[i],1);
            }
}
        for(int i=0;i<letters.length;i++)
        {
            if(hm.get(letters[i])==1)
            {
                return i;
            }
                
        }
    return -1;
    }
}
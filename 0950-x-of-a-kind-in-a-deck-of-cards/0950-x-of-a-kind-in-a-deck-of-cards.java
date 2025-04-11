class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int val:deck)
        {
            if(hm.containsKey(val)==false)
            {
              hm.put(val,1);
            }
            else{
                int temp=hm.get(val);
                hm.put(val,temp+1);
            }
        }
        int sol=0;
        for(int ans:hm.keySet())
        {
            sol=gcd(sol,hm.get(ans));
        }
        if(sol>1)
        return true;
        return false;
    }
    public static int gcd(int a ,int b)
    {
        if(a==0)
        return b;
        int temp=gcd(b%a,a);
        return temp;
    }
}
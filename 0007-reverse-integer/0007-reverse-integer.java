class Solution {
    public int reverse(int x) {
        int set=0;
        if(x<0)
    {
        set=1;
        x=Math.abs(x);
    }
    
    long ans=0;
    while(x!=0)
    {
       int l=x%10;
        ans=ans*10+l;
        if(ans<Integer.MIN_VALUE || ans>Integer.MAX_VALUE)
        return 0;
        x=x/10;

    }
    if(set==1)
    ans=0-ans;
    return (int)ans;
    }
}
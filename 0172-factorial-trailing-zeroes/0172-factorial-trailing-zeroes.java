class Solution {
    public int trailingZeroes(int n) {
        int nof=0;
        int not=0;
        for(int i=1;i<=n;i++)
        {
            int num=i;
            while(num%5==0)
            {
                nof++;
                num=num/5;
            }
            while(num%2==0)
            {
                not++;
                num=num/2;
            }

        }
        return Math.min(nof,not);
    }
}
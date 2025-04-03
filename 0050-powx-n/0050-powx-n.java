class Solution {
    public double myPow(double x, int n) {
        double res=1.0;
        long pow=n;
        if(pow<0)
        {
            pow=pow*(-1);
            x=1/x;
        }

        while(pow>0)
        {
            if(pow%2==0)
            {
                x=x*x;
                pow=pow/2;
            }
            else
            {
                res=res*x;
                pow--;
            }
        }
        return res;
    }
}
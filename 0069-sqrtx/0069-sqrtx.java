class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1)
        {
            return x;
        }
        int low = 1;
        int high = x;
        int store = 0;
        while(low<=high)
        {
            int mid = low +(high-low)/2;
            if(mid*mid==x )
            {
                return mid;
            }
            else if((long)mid*mid < (long)x)
            {
                if(mid > store){
                store = mid;
                }
                low = mid+1;
               
            }
            else{
                high = mid-1;
                
            }
        }
        return store;
    }
}
        
    

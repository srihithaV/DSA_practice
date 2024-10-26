class Solution {
    public int subtractProductAndSum(int n) {
         int sum=0;
       int multiply=1;
       while(n!=0)
       {
           int lastdigit= n%10;
           sum=sum+lastdigit;
           multiply=multiply*lastdigit;
           n=n/10;
       } 
       return multiply-sum;
    }
}
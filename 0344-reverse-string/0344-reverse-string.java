class Solution {
   public void reverseString(char[] s) {
    int n = s.length;
    int st = 0;
    int ed=n-1;
    while(st<ed)
        {
        char temp=s[ed];
        s[ed]=s[st];
       s[st]=temp;
        st++;
        ed--;
    }
    }
}
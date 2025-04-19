class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0) return 0;
        int sign=1;
        int idx=0;
        if(s.charAt(idx)=='-'||s.charAt(idx)=='+')
        {
            sign=s.charAt(idx)=='-'?-1:1;
            idx++;
        }
        long result=0;
        while(idx<s.length()&&Character.isDigit(s.charAt(idx)))
        {
            result=result*10+(s.charAt(idx)-'0');
            if(sign*result>Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
            else if(sign*result<Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
            idx++;

        }
            return sign*(int)result;
    }
}
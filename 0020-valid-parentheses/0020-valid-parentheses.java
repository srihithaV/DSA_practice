class Solution {
    public boolean isValid(String s) {
        if(s=="( )" || s=="[ ]" || s=="{ }")
        return true;
        Stack<Character> st = new Stack<>();
        for(int i =0;i<s.length();i++)
        {
            if(st.size()==0)
            {
                st.push(s.charAt(i));
                continue;
            }
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')
            {
                st.push(s.charAt(i));
                continue;
            }
            else
            {
                if(s.charAt(i)==')')
                {
                    if(st.peek()=='(')
                    {
                        st.pop();
                    }
                    else 
                    return false;
                }
                if(s.charAt(i)=='}')
                {
                   if(st.peek()=='{')
                   {
                       st.pop();
                   }
                   else
                   return false;
                }
                if(s.charAt(i)==']')
                {
                   if(st.peek()=='[')
                   {
                       st.pop();
                   }
                   else
                   return false;
                }
            }
        }
        if(st.size()==0)
        return true;
        
 return false;   }
    
}
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int i=0;
        int j=0;
        while(i<pushed.length && j<popped.length)
        {
            if(st.size()==0)
            {
                st.push(pushed[i]);
                i++;
                continue;
            }
            if(st.peek()==popped[j])
            {
                st.pop();
                j++;
            }
            else
            {
                st.push(pushed[i]);
                i++;
            }
        }
            while(j<popped.length && popped[j]==st.peek())
            {
               st.pop();
               j++;
            }
            if(st.size()>0)
            {
                return false;
            }
            else{
            return true;
        }
        }
    
}
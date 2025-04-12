class Solution {
    public String reverseStr(String s, int k) {
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i+=2*k)
        {
            int st=i;
            int ed=Math.min(i+k,s.length())-1;
           
            while(st<ed){
            char temp=ch[st];
            ch[st]=ch[ed];
            ch[ed]=temp;
            st++;
            ed--;
            }
        }

            return new String(ch);
        }
    }

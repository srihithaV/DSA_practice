class Solution {
    public int countValidWords(String sentence) {
      int count=0;
      String str[]=sentence.split(" ");
      for(String i:str)
      {
        String  s=i;
      if(check(s))
      {
        count++;
      }
      }
      return count;
    }


    public boolean check(String str)
    {
        int n = str.length();
        int h=0;
        int p=0;
        if(n==0) return false;
        for(int i=0;i<n;i++)
        {
            char c=str.charAt(i);
            if(Character.isDigit(c))
            {
                return false;
            }
            else if(c=='-')
            {
                h++;
  if(h>1 || i==0 || i==n-1|| !Character.isLowerCase(str.charAt(i-1))|| !Character.isLowerCase(str.charAt(i+1)))
                return false;
            }
            else if(c=='!' || c=='.'||c==',')
            {
                p++;
                if(p>1 ||i!=n-1)
                return false;
            }


        }
        return true;
    }



}
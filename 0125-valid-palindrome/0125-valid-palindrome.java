class Solution {
    public boolean isPalindrome(String s) {
        s=s.trim();
        s=s.toLowerCase();
        char[] arr=s.toCharArray();
        int st=0;
        int ed=arr.length-1;
        while(st<ed)
        {
           while(st<ed && !(arr[st]>='a' && arr[st]<='z' || arr[st]>='A' && arr[st]<='Z'|| arr[st]>='0' && arr[st]<='9'))
            {
                st++;
            }
          while(st<ed && !(arr[ed]>='a' && arr[ed]<='z' || arr[ed]>='A' && arr[ed]<='Z'||arr[ed]>='0' && arr[ed]<='9'))
                 {
                     ed--;
                 }
            
            if(arr[st]==arr[ed])
            {
                st++;
                ed--;
            }
            else if(arr[st]!=arr[ed])
                return false;
            }
             return true;
        }
       
    }

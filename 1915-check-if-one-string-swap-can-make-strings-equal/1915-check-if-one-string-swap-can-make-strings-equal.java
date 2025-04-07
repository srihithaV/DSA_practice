class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int check[]=new int[2];
        int count=0;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=s2.charAt(i)){
            count++;
             if(count>2){
            return false;
               }
            if(count==1){
            check[0]=i;
            }
            if(count==2)
            {
            check[1]=i;
            }
            }
        }
        return s1.charAt(check[0])==s2.charAt(check[1]) && s1.charAt(check[1])==s2.charAt(check[0]);
        
    }
}
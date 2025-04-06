class Solution {
    public int lengthOfLastWord(String s) {
        int e=s.length()-1;
        int count=0;
       
        while (e >= 0 && s.charAt(e) == ' ') {
            e--;
        }
        while( e>=0 && (s.charAt(e))!=' ')
        {
           count++;
           e--; 
        }
        return count;

    }
}
class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> set=new HashSet<>();
        for(char c:"aeiouAEIOU".toCharArray())
        {
            set.add(c);
        }
        int left=0;
        int right=s.length()-1;
        char arr[]=s.toCharArray();
        while(left<right)
        {
            if(set.contains(arr[left]) && set.contains(arr[right]))
            {
                char temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            else if(!set.contains(arr[left]))
            left++;
            else
            right--;
        }
        return new String(arr);
    }
}
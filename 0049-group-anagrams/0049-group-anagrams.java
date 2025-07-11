class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
           int n = strs.length;
        int[] check = new int[n];
        List<List<String>> res2 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (check[i] == 1) continue;

            int[] arr = new int[26];
            for (int k = 0; k < strs[i].length(); k++) {
                arr[strs[i].charAt(k) - 'a']++;
            }

            List<String> res = new ArrayList<>();
            res.add(strs[i]);
            check[i] = 1;

            for (int j = i + 1; j < n; j++) {
                if (check[j] == 1) continue;

                int[] temp = new int[26];
                for (int m = 0; m < strs[j].length(); m++) {
                    temp[strs[j].charAt(m) - 'a']++;
                }

                boolean isAnagram = true;
                for (int x = 0; x < 26; x++) {
                    if (arr[x] != temp[x]) {
                        isAnagram = false;
                        break;
                    }
                }

                if (isAnagram) {
                    res.add(strs[j]);
                    check[j] = 1;
                }
            }

            res2.add(res);
        }

        return res2;
    }
}
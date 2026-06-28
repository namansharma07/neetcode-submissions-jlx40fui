class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs)
        {
            int freq []= new int[26];
            for(char c : s.toCharArray())
            {
                freq[c-'a']++;
            }
            String temp = "";
            for(int i : freq)
            {
                temp = temp + "#";
                temp = temp + i;
            }
           if(map.get(temp) != null)
           {
            map.get(temp).add(s);
           }
           else{
            List<String> l = new ArrayList<>();
            l.add(s);
            map.put(temp,l);
           }
        }

        return new ArrayList<>(map.values());

        
    }
}

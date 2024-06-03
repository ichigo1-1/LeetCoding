class Solution {
    public String customSortString(String order, String s) {
        // int[]freq=new int[26];
        // for(char ch:s.toCharArray())
        // {
        //     freq[ch-'a']++;
        // }
        // StringBuilder sb=new StringBuilder();
        // //jbtk order ka char milta hai tbtk append karo
        // for(char ch:order.toCharArray())
        // {
        //     while(freq[ch-'a']-->0)
        //     {
        //         sb.append(ch);
        //     }
        // }
        // //now add the rest
        // for(char ch:s.toCharArray())
        // {
        //     while(freq[ch-'a']-->0)
        //     {
        //         sb.append(ch);
        //     }
        // }
        // return sb.toString();




        ///USING MAP
        HashMap<Character, Integer> freq = new HashMap<>();
        
        // Count the frequency of each character in s
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        
        StringBuilder sb = new StringBuilder();
        
        // Append characters in the order defined by the order string
        for (char ch : order.toCharArray()) {
            if (freq.containsKey(ch)) {
                int count = freq.get(ch);
                for (int i = 0; i < count; i++) {
                    sb.append(ch);
                }
                freq.remove(ch); // Remove the character once it's fully appended
            }
        }
        
        // Append the remaining characters that were not in order
        for (char ch : s.toCharArray()) {
            if (freq.containsKey(ch)) {
                int count = freq.get(ch);
                for (int i = 0; i < count; i++) {
                    sb.append(ch);
                }
                freq.remove(ch); // Remove the character once it's fully appended
            }
        }
        
        return sb.toString();
    }
}
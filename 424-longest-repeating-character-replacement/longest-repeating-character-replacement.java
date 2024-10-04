class Solution {
    public int characterReplacement(String s, int k) {
        int i = 0, j = 0;
        int n = s.length();
        int maxfreq = 0;  // To store the maximum frequency of any character in the window
        int ans = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        
        while (j < n) {
            char cur = s.charAt(j);
            
            // Update frequency of the current character
            hm.put(cur, hm.getOrDefault(cur, 0) + 1);
            
            // Update maxfreq (the most frequent character in the current window)
            maxfreq = Math.max(maxfreq, hm.get(cur));
            
            // Calculate the number of changes needed to make the current window all the same character
            int len = j - i + 1;
            int changes = len - maxfreq;
            
            // If the number of changes exceeds k, shrink the window
            if (changes > k) {
                char start = s.charAt(i);
                hm.put(start, hm.get(start) - 1);
                i++;
            }
            
            // Update the result with the maximum valid window size
            ans = Math.max(ans, j - i + 1);
            
            j++;
        }
        
        return ans;
    }
}

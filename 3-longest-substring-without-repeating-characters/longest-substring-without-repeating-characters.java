class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();
        int maxlen = 0;
        int i = 0; // Pointer for the start of the substring
        int j = 0; // Pointer for the end of the substring
        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                maxlen = Math.max(maxlen, j - i + 1);
                j++;
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return maxlen;
        
    //     int[] arr = new int[256];
    // int max = 0;
    // int n = s.length();
    
    // for (int i = 0; i < n; i++) {
    //     // Reset the array for each new starting point
    //     Arrays.fill(arr, 0);
        
    //     for (int j = i; j < n; j++) {
    //         // If character at j has been seen, break the loop
    //         if (arr[s.charAt(j)] == 1) {
    //             break;
    //         }
            
    //         // Otherwise, add the character to substring
    //         int len = j - i + 1;
    //         max = Math.max(len, max);
    //         // Remember it
    //         arr[s.charAt(j)] = 1;
    //     }
    // }
    // return max;
    }
        
    }

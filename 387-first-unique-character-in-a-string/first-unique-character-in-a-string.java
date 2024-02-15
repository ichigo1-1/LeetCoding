class Solution {
    public int firstUniqChar(String S) {
         for (int i = 0; i < S.length(); i++) {
            char currentChar = S.charAt(i);
            boolean foundDuplicate = false;
            
            // Check if the current character appears elsewhere in the string
            for (int j = 0; j < S.length(); j++) {
                if (i != j && currentChar == S.charAt(j)) {
                    foundDuplicate = true;
                    break;
                }
            }
            
            // If the current character is non-repeating, return it
            if (!foundDuplicate) {
                return i;
            }
        }
        
        // If no non-repeating character is found, return '$'
        return -1;
        
    }
}
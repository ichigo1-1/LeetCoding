class Solution {
    public int firstUniqChar(String S) {
        //  for (int i = 0; i < S.length(); i++) {
        //     char currentChar = S.charAt(i);
        //     boolean foundDuplicate = false;
            
        //     // Check if the current character appears elsewhere in the string
        //     for (int j = 0; j < S.length(); j++) {
        //         if (i != j && currentChar == S.charAt(j)) {
        //             foundDuplicate = true;
        //             break;
        //         }
        //     }
            
        //     // If the current character is non-repeating, return it
        //     if (!foundDuplicate) {
        //         return i;
        //     }
        // }
        
        // // If no non-repeating character is found, return '$'
        // return -1;


        //Approach 2
        //maintain a map with array
        int[]freq=new int[26];
        for(int i=0;i<S.length();i++)
        {
            char ch=S.charAt(i);
            freq[ch-'a']++;
        }
        //again traverse
        for(int j=0;j<S.length();j++)
        {
            char ch = S.charAt(j);
            if(freq[ch-'a']==1)
            {
                return j;
            }
        }
        return -1;
        
    }
}
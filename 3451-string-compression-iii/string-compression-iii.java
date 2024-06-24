public class Solution {
    public String compressedString(String word) {
        // String s1 = fun1(word);
        // String res = fun2(s1);
        // return res;   
         StringBuilder comp = new StringBuilder();
        int i = 0;
        
        while (i < word.length()) {
            char currentChar = word.charAt(i);
            int count = 0;
            
            // Count the number of consecutive characters, up to 9
            while (i < word.length() && word.charAt(i) == currentChar && count < 9) {
                count++;
                i++;
            }
            
            // Append the count and the character to the compressed string
            comp.append(count).append(currentChar);
        }
        
        return comp.toString();
    }
    
    // public String fun1(String s) {
    //     StringBuilder st = new StringBuilder();
    //     st.append(s.charAt(0));
    //     for (int i = 1; i < s.length(); i++) {
    //         char current = s.charAt(i);
    //         char prev = s.charAt(i - 1);
    //         if (current != prev) {
    //             st.append(current);
    //         }
    //     }
    //     return st.toString();
    // }
    
    // public String fun2(String s) {
    //     StringBuilder st = new StringBuilder();
    //     int count = 1;
    //     for (int i = 1; i <= s.length(); i++) {
    //         if (i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
    //             count++;
    //         } else {
    //             st.append(count);
    //             count = 1;
    //             if (i < s.length()) {
    //                 st.append(s.charAt(i));
    //             }
    //         }
    //     }
    //     return st.toString();
    // }
}

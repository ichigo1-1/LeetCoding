class Solution {
    public boolean isAnagram(String s, String t) {
        String a = sortString(s);
        String b=sortString(t);
        return a.equals(b);

    }
    public static String sortString(String str) {
        // Convert the string to a character array
        char[] charArray = str.toCharArray();
        
        // Sort the character array
        Arrays.sort(charArray);
        
        // Convert the sorted character array back to a string
        return new String(charArray);
    }
}
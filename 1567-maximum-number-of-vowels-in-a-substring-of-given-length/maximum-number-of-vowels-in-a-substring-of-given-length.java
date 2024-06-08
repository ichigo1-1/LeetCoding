class Solution {
    public int maxVowels(String s, int k) {
        int i = 0;
        int j = 0;
        int n = s.length();
        int result = 0;
        int count = 0;

        while (j < n) {
            char chu = s.charAt(j);
            if (isVowel(chu)) {
                count++;
            }

            if (j - i + 1 == k) {  // When window size is exactly k
                result = Math.max(result, count);
                char ch = s.charAt(i);
                if (isVowel(ch)) {
                    count--;
                }
                i++;  // Slide the window
            }

            j++;
        }
        return result;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}

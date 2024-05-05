class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[256]; // Assuming ASCII characters
int max = 0;
int maxFreq = 0;

for (int i = 0; i < s.length(); i++) {
    Arrays.fill(freq, 0); // Resetting frequency array for each i
    for (int j = i; j < s.length(); j++) {
        freq[s.charAt(j) - 'A']++;
        maxFreq = Math.max(maxFreq, freq[s.charAt(j) - 'A']);
        int changes = j - i + 1 - maxFreq;
        if (changes <= k) {
            max = Math.max(max, j - i + 1);
        } else {
            break;
        }
    }
}

return max;

    }
}
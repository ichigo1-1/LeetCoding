class Solution {
    public int findKthNumber(int n, int k) {
        int curr = 1;  // Starting from 1, the smallest lexicographical number
        k--;  // Since we already start with 1, decrement k

        while (k > 0) {
            int steps = calculateSteps(curr, n);
            if (steps <= k) {
                // Move to the next number in the current lexicographical order
                curr++;
                k -= steps;
            } else {
                // Move deeper into the current number (append '0')
                curr *= 10;
                k--;
            }
        }

        return curr;
    }

    // Helper function to calculate how many numbers exist between `curr` and `curr + 1`
    private int calculateSteps(int curr, int n) {
        int steps = 0;
        long first = curr;
        long last = curr;

        while (first <= n) {
            steps += Math.min(last, n) - first + 1;
            first *= 10;
            last = last * 10 + 9;
        }

        return steps;
    }
}

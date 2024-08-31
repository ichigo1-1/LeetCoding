class Solution {
    public int longestConsecutive(int[] nums) {
         if (nums.length == 0) {
            return 0; // Handle edge case for empty array
        }

        Arrays.sort(nums); // Sort the array
        int max = 1; // Variable to store the length of the longest sequence
        int count = 1; // Variable to count the current sequence length

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                // Current number is consecutive
                count++;
            } else if (nums[i] != nums[i - 1]) {
                // Current number is not consecutive and is not a duplicate
                max = Math.max(max, count);
                count = 1; // Reset count for the new sequence
            }
        }
        // After the loop, update max for the last sequence
        max = Math.max(max, count);
        return max;
    }
}
class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int max = -1; // Initialize max to -1 for the last element

        // Traverse the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[i]; // Store the current element
            arr[i] = max; // Replace the current element with the maximum value found so far
            max = Math.max(max, temp); // Update max if necessary
        }

        return arr;
    }
}
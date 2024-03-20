import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        // Create a map to store the original indices of scores
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < score.length; i++) {
            map.put(score[i], i);
        }
        
        // Sort the scores in descending order
        Arrays.sort(score);
        reverse(score);
        
        // Initialize the result array
        String[] result = new String[score.length];
        
        // Assign ranks to the athletes
        for (int i = 0; i < score.length; i++) {
            int originalIndex = map.get(score[i]);
            if (i == 0) {
                result[originalIndex] = "Gold Medal";
            } else if (i == 1) {
                result[originalIndex] = "Silver Medal";
            } else if (i == 2) {
                result[originalIndex] = "Bronze Medal";
            } else {
                result[originalIndex] = String.valueOf(i + 1);
            }
        }
        
        return result;
    }
    
    // Helper function to reverse an array
    private void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}

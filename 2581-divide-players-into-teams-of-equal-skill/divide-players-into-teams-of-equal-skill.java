import java.util.Arrays;

class Solution {
    
    // Helper function to check if we can form valid pairs with equal sums
    public boolean isPairwiseEqualSum(int[] arr, int targetSum) {
        int i = 0;
        int j = arr.length - 1;
        
        while (i < j) {
            int curSum = arr[i] + arr[j];
            if (curSum != targetSum) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);  // Sort the array
        
        // Calculate the target sum for pairs
        int targetSum = skill[0] + skill[skill.length - 1];
        long sum = 0;
        int n = skill.length;
        
        // Check if the pairs are valid
        if (isPairwiseEqualSum(skill, targetSum)) {
            for (int i = 0; i < n / 2; i++) {
                sum += skill[i] * skill[n - i - 1];  // Calculate the sum of products of pairs
            }
            return sum;
        } else {
            return -1;  // Return -1 if pairing is not possible
        }
    }
}

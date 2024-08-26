class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1); // Initializing with sum 0 and count 1
        
        int count = 0; // This will store the result
        int sum = 0; // This keeps track of the current sum of odd numbers

        for (int num : nums) {
            sum += num % 2; // Increment sum if the number is odd (num % 2 == 1)

            if (hm.containsKey(sum - k)) {
                count += hm.get(sum - k); // Add the number of times (sum - k) has occurred
            }

            // Update the hash map with the current sum
            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}